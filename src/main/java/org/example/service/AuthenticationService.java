package org.example.service;

import org.example.User;
import org.example.data.UserRepository;

public class AuthenticationService {
    private UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUserName(username);
        return "abracadabra".equals(password);
    }
}
