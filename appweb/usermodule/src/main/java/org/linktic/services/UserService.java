package org.linktic.services;

import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<String> crudUser(String request);
    ResponseEntity<String> Login(String request);
}
