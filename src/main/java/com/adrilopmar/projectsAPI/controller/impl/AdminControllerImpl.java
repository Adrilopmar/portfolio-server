package com.adrilopmar.projectsAPI.controller.impl;

import com.adrilopmar.projectsAPI.dto.AdminDto;
import com.adrilopmar.projectsAPI.model.User;
import com.adrilopmar.projectsAPI.service.impl.AdminServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminControllerImpl {

    @Autowired
    private AdminServiceImpl adminService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User AddAdmin( @RequestBody @Valid AdminDto adminDto) {
        return adminService.createAdmin(adminDto);
    }
}
