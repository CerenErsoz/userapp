package com.example.userapp.service;

import com.example.userapp.model.User;
import com.example.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository _userRepository;

    @Autowired // constructor injection
    public UserService(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return _userRepository.findAll();
    }

    public Optional<User> getUserById(Long Id) {
        return _userRepository.findById(Id);
    }

    public User createUser(User user) {
        return _userRepository.save(user);
    }
}
