package org.linktic.controller;

import lombok.extern.log4j.Log4j2;
import org.linktic.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService _userService;
    public UserController(UserService userService) {
        _userService = userService;
    }
    @PostMapping(value = "/crudUser" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> CrudUser(@RequestBody String request){
        return _userService.crudUser(request);
    }

}
