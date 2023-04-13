package com.adrilopmar.projectsAPI.service.impl;

import com.adrilopmar.projectsAPI.dto.AdminDto;
import com.adrilopmar.projectsAPI.model.Role;
import com.adrilopmar.projectsAPI.model.User;
import com.adrilopmar.projectsAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AdminServiceImpl {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private  PasswordEncoder passwordEncoder;

    public List<User> getAllUser(Authentication authentication){
        authentication(authentication);
        return userRepository.findAll();
    }

    public User createAdmin(AdminDto dto,Authentication authentication) {
        authentication(authentication);
        Role adminRole = new Role("ADMIN");
        User admin = new User(
                dto.getName(),
                dto.getUsername(),
                passwordEncoder.encode(dto.getPassword()),
                List.of(adminRole));
        userRepository.save(admin);
        return admin;
    }
    public void authentication(Authentication authentication){
        if(authentication == null ||
                !SecurityContextHolder.getContext().getAuthentication().getName().equals(authentication.getName())){
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,"Access denied");
        }
    }
}
