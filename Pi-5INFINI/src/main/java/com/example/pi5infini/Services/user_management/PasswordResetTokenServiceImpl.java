package com.example.pi5infini.Services.user_management;

import com.example.pi5infini.DAO.Entities.PasswordResetToken;
import com.example.pi5infini.DAO.Entities.User;
import com.example.pi5infini.DAO.Repositories.IPasswordResetTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

@Service
public class PasswordResetTokenServiceImpl implements PasswordResetTokenService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private final IPasswordResetTokenRepo passwordResetTokenRepository;

    public PasswordResetTokenServiceImpl(IPasswordResetTokenRepo passwordResetTokenRepository) {
        this.passwordResetTokenRepository = passwordResetTokenRepository;
    }

//    @Override
//    public PasswordResetToken generateTokenForUser(User user) {
//        String tokenString = generateTokenString();
//        Date expiryDate = calculateExpiryDate();
//        PasswordResetToken token = new PasswordResetToken(tokenString, user, expiryDate);
//        passwordResetTokenRepository.save(token);
//        System.out.println("Generated token: " + token);
//        return token;
//    }

    @Override
    public PasswordResetToken generateTokenForUser(User user) {
        String tokenString = generateTokenString();
        Date expiryDate = calculateExpiryDate();
        PasswordResetToken token = new PasswordResetToken(tokenString, user, expiryDate);
        passwordResetTokenRepository.save(token);
        System.out.println("Generated token: " + token);
        return token;
    }


    @Override
    public PasswordResetToken findByToken(String tokenString) {
        return passwordResetTokenRepository.findByToken(tokenString);
    }

    @Override
    public void delete(PasswordResetToken token) {
        passwordResetTokenRepository.delete(token);
    }

    private String generateTokenString() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[20];
        random.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);    }

    private Date calculateExpiryDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR_OF_DAY, 1);
        return cal.getTime();
    }
}


