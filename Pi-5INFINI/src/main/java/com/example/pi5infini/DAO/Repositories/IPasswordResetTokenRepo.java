package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.DAO.Entities.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPasswordResetTokenRepo extends JpaRepository<PasswordResetToken,Long> {
    public PasswordResetToken findByToken(String tokenString);
}
