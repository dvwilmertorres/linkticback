package org.linktic.implement;

import org.linktic.repository.UserInformationRepository;
import org.linktic.repository.UserRepository;
import org.linktic.services.UserInformationService;
import org.linktic.utils.ErrorControlUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class UserInformationimpl implements UserInformationService {
    private final ErrorControlUtils _errorControlutils;
    private final UserInformationRepository _userInformationRepository;

    public UserInformationimpl(ErrorControlUtils errorControlutils, UserRepository userRepository, UserInformationRepository userInformationRepository) {
        _errorControlutils = errorControlutils;
        _userInformationRepository = userInformationRepository;
    }
    @Override
    public ResponseEntity<String> findUserInfromation(String request) {
        return null;
    }

    @Override
    public ResponseEntity<String> addUserInformation(String request) {
        return null;
    }
}
