package org.example;

public class AuthenticationService {
    private UserRepository userRepository;
    public boolean authenticate(String username, String password) {
        User user = userRepository.findByUserName(username);
        return "abracadabra".equals(password);
    }
}
