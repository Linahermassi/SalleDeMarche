package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Formation;
import com.example.pi5infini.DAO.Entities.IndicateurTechnique;

import java.util.List;

public interface IIndicateurTechniqueService {
    IndicateurTechnique addIndicateur (IndicateurTechnique indicateurTechnique);
    IndicateurTechnique editIndicateur (IndicateurTechnique indicateurTechnique);
    List<IndicateurTechnique> selectAllIndicateur();
    IndicateurTechnique SelectIndicateurById(int indicateurId);
    void deleteIndicateurById(int indicateurId);
    void deleteAllIndicateurs();
}
