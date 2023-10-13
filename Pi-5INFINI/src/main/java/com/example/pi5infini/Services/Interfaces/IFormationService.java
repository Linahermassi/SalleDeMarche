package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Actualite;
import com.example.pi5infini.DAO.Entities.Formation;

import java.util.List;

public interface IFormationService {
    Formation addFormation (Formation formation);
    Formation editFormation (Formation formation);
    List<Formation> selectAllFormation();
    Formation SelectFormationById(int formationId);
    void deleteFormationById(int formationId);
    void deleteAllFormations();
}
