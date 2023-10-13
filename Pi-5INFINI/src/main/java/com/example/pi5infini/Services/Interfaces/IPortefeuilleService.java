package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.ParametreStrategie;
import com.example.pi5infini.DAO.Entities.Portefeuille;

import java.util.List;

public interface IPortefeuilleService {
    Portefeuille addPortefeuille (Portefeuille portefeuille);
    Portefeuille editPortefeuille (Portefeuille portefeuille);
    List<Portefeuille> selectAllPortefeuille();
    Portefeuille SelectPortefeuilleById(int portefeuilleId);
    void deletePortefeuilleById(int portefeuilleId);
    void deleteAllParametres();
}
