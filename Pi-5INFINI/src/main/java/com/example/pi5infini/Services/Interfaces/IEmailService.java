package com.example.pi5infini.Services.Interfaces;


import javax.validation.constraints.Email;

public interface IEmailService {
    public String sendEmail(Email details);
}
