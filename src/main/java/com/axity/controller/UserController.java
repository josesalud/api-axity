package com.axity.controller;

import com.axity.entity.User;
import com.axity.repository.IUserRepository;
import com.axity.service.UserRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    public UserRepositoryImpl userRepository;

    @GetMapping
    public List<User> users(){
        return userRepository.findAllUser();
    }

    @PostMapping
    public User user(@RequestBody User user){
        return userRepository.save(user);
    }

}
