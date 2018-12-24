package com.ayv.cargoods.controller;

import com.ayv.cargoods.domain.User;
import com.ayv.cargoods.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PreAuthorize("permitAll()")
    @PostMapping(value = "/register")
    public ResponseEntity<?> createUser(@RequestBody User user) {

        return ResponseEntity.ok(userService.createUser(user));
    }
}
