package com.creditodigital.controllers;

import com.creditodigital.dtos.UserDTO;
import com.creditodigital.entities.User;
import com.creditodigital.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> findAllUsers(){
        List<UserDTO> usersDto = userService.listAllUsers();
        return ResponseEntity.ok(usersDto);
    }
    @PostMapping("/insert")
    public ResponseEntity<UserDTO> insertUser(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> userLogin(@RequestBody User user){
        User userLogin = userService.findByEmail(user.getEmail());
        if(userLogin.getEmail().isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }
        System.out.println(user.getPassword() +" - " + " - " +userLogin.getPassword());
        boolean valid = encoder.matches( userLogin.getPassword(),user.getPassword());
        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(true);
    }
}
