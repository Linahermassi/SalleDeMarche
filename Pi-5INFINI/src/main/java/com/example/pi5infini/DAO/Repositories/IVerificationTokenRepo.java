package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.Services.user_management.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IVerificationTokenRepo extends JpaRepository<VerificationToken,Long> {
    Optional<VerificationToken> findByToken(String token);


}
