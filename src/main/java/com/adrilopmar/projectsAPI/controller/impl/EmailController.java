package com.adrilopmar.projectsAPI.controller.impl;

import com.adrilopmar.projectsAPI.dto.EmailDto;
import com.adrilopmar.projectsAPI.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/mail")
@CrossOrigin()
public class EmailController {
    @Autowired
    EmailServiceImpl emailService;
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public SimpleMailMessage sendEmail(@RequestBody EmailDto emailDto){
        return emailService.sendEmail(emailDto);
    }
}
