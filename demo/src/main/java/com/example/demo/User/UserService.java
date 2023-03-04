package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Security.Authority;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(User user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        Authority authority = new Authority();
        authority.setAuthority("ROLE_USER");

        authority.setUser(user);

        //user.getAuthorities().add(authority);
        return userRepo.save(user);
    }

    public void addUser(int id, String username, String password, String firstName, String lastName,
            String healthCareNumber, String threatyNo, String phoneNumber, String email) {

    }

    public void addUser(User user) {
        userRepo.save(user);
    }

    public Object findByUsername(String username) {
        return null;
    }
}
