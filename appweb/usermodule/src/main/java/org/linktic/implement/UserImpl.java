package org.linktic.implement;

import lombok.Data;
import org.linktic.entity.UserEntity;
import org.linktic.model.UserDto;
import org.linktic.repository.UserRepository;
import org.linktic.services.UserService;

import org.linktic.utils.EncoderUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserImpl implements UserService {
    private final UserRepository _userRepository;

    public UserImpl(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public ResponseEntity<String> crudUser(String request) {
        EncoderUtils.validateBase64(request);
        UserDto decodeRequest = EncoderUtils.decodeRequest(request, UserDto.class);
        ResponseEntity<String> response = findUser(decodeRequest);
        if (response == null || response.getBody() == null || response.getBody().isEmpty()) {
            System.out.println("La respuesta está en blanco.");
        } else {
            return response;
        }
        return null;
    }

    @Override
    public ResponseEntity<String> Login(String request) {
        EncoderUtils.validateBase64(request);
        UserDto decodeRequest = EncoderUtils.decodeRequest(request, UserDto.class);
        return null;
    }

    public ResponseEntity<String> findUser(UserDto decodeRequest) {
        Optional<UserEntity> response = _userRepository.findById(decodeRequest.getPkid_user());
        if (response.isEmpty()) {
            return ResponseEntity.status(404).body("User not found");
        }
        // Codificar la respuesta en Base64
        String encodedResponse = EncoderUtils.encodeResponse(response.get());
        return ResponseEntity.ok(encodedResponse);
    }
}
