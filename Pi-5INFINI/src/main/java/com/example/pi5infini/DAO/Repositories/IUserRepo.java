package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.DAO.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
     Optional<User> findByEmail(String email);

}

