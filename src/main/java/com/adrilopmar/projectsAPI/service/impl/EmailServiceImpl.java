package com.adrilopmar.projectsAPI.service.impl;

import com.adrilopmar.projectsAPI.dto.EmailDto;
import com.adrilopmar.projectsAPI.model.ContactMessage;
import com.adrilopmar.projectsAPI.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailServiceImpl {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private ContactMessageRepository contactMessageRepository;


    public SimpleMailMessage sendEmail(EmailDto dto){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("lopmaradria@gmail.com");
        message.setSubject("Hey Adri! new contact from portfolio!");
        message.setText("Client mail: " + dto.getEmail() + "\n\nMessage: " +dto.getMessage());

        ContactMessage newEntry = new ContactMessage(dto.getName(),dto.getEmail(), dto.getMessage());

        contactMessageRepository.save(newEntry);
        mailSender.send(message);
        return message;
    }
}
