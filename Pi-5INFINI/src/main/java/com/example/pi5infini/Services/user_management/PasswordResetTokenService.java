package com.example.pi5infini.Services.user_management;


import com.example.pi5infini.DAO.Entities.PasswordResetToken;
import com.example.pi5infini.DAO.Entities.User;

public interface PasswordResetTokenService {
    PasswordResetToken generateTokenForUser(User user);

    PasswordResetToken findByToken(String tokenString);

    void delete(PasswordResetToken token);

//    void sendPasswordResetEmail(String email, String token);
}
