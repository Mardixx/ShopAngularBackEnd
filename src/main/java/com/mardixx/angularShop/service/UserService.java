package com.mardixx.angularShop.service;

import com.mardixx.angularShop.model.UserModel;
import com.mardixx.angularShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }

    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteById(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
        else throw new RuntimeException("User with id: " + id + " could not be found");
    }
}
