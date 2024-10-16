package com.axity.service;

import com.axity.entity.User;
import com.axity.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
