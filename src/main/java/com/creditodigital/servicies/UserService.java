package com.creditodigital.servicies;

import com.creditodigital.dtos.UserDTO;
import com.creditodigital.entities.User;
import com.creditodigital.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public UserDTO findById(String id){
        return new UserDTO(userRepository.findById(id).get());
    }
    public User findByEmail(String email){
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new RuntimeException("Usuário não encontrado");
        }
        return user;
    }
    public List<UserDTO> listAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream().map(this::convertToDto).collect(Collectors.toList());
    }
    public UserDTO registerUser(User user){
        return new UserDTO(userRepository.save(user));
    }

    private UserDTO convertToDto(User user){
        return new UserDTO(user);
    }
}
