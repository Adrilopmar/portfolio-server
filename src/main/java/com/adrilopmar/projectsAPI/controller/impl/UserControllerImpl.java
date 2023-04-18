package com.adrilopmar.projectsAPI.controller.impl;

import com.adrilopmar.projectsAPI.model.User;
import com.adrilopmar.projectsAPI.repository.UserRepository;
import com.adrilopmar.projectsAPI.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerImpl {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AdminServiceImpl adminService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUser(Authentication authentication) {
        return  adminService.getAllUser(authentication);
    }

}
