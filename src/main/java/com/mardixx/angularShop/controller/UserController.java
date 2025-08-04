package com.mardixx.angularShop.controller;

import com.mardixx.angularShop.model.UserModel;
import com.mardixx.angularShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.save(user);
    }

    @GetMapping
    public List<UserModel> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserModel> findUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
