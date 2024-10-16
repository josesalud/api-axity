package com.axity.service;

import com.axity.entity.User;
import com.axity.repository.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserRepositoryImpl  {

    @Autowired
    public IUserRepository userRepository;

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
