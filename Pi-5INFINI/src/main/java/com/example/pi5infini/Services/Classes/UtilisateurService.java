package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Utilisateur;
import com.example.pi5infini.DAO.Repositories.UtilisateurRepository;
import com.example.pi5infini.Services.Interfaces.IUtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService implements IUtilisateurService {
    private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur editUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> selectAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur SelectUtilisateurById(int utilisateurId) {
        return utilisateurRepository.findById(utilisateurId).get();
    }

    @Override
    public void deleteUtilisateurById(int utilisateurId) {
        utilisateurRepository.deleteById(utilisateurId);
    }

    @Override
    public void deleteAllUtilisateur() {
        utilisateurRepository.deleteAll();
    }
}
