package com.example.pi5infini.RestControllers;

import com.example.pi5infini.DAO.Entities.Email;
import com.example.pi5infini.Services.Classes.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SenderEmailController {

    @Autowired
    private EmailService service;


    // @PostMapping  ("/sendemail") //oubien get ssss

    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody Email details) {
        String status
                = service.sendEmail(details);

        return status;
    }
}