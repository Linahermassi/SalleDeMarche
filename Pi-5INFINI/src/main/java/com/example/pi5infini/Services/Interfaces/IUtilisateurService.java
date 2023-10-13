package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Transaction;
import com.example.pi5infini.DAO.Entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    Utilisateur addUtilisateur (Utilisateur utilisateur);
    Utilisateur editUtilisateur (Utilisateur utilisateur);
    List<Utilisateur> selectAllUtilisateur();
    Utilisateur SelectUtilisateurById(int utilisateurId);
    void deleteUtilisateurById(int utilisateurId);
    void deleteAllUtilisateur();
}
