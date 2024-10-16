package com.axity.controller;

import com.axity.entity.User;
import com.axity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity users(){
        List<User> allUser = this.userService.findAllUser();

        Map<String, Object> response = new HashMap<>();
        response.put("users",allUser);
        response.put("httpStatus", HttpStatus.OK);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity user(@RequestBody User user){
        User usuario = this.userService.save(user);

        Map<String, Object> response = new HashMap<>();
        response.put("user",usuario);
        response.put("httpStatus", HttpStatus.CREATED);

        return ResponseEntity.ok(response);
    }

}
