package com.example.pi5infini.Services.user_management;


import com.example.pi5infini.DAO.Entities.PasswordResetToken;

public interface EmailService {
    void sendPasswordResetEmail(String email, PasswordResetToken token);

    //void sendPasswordResetEmail(String email, PasswordResetToken token);
}
