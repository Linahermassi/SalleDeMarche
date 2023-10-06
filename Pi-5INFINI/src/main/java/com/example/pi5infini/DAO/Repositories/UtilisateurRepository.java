package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.DAO.Entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
