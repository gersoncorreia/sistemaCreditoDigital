package com.creditodigital.controllers;

import com.creditodigital.dtos.UserDTO;
import com.creditodigital.entities.User;
import com.creditodigital.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserDTO>> findAllUsers(){
        List<UserDTO> usersDto = userService.listAllUsers();
        return ResponseEntity.ok(usersDto);
    }
    @PostMapping("/insert/user")
    public ResponseEntity<UserDTO> insertUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }
}
