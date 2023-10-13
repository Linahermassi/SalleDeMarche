package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Formation;
import com.example.pi5infini.DAO.Repositories.FormationRepository;
import com.example.pi5infini.Services.Interfaces.IFormationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FormationService implements IFormationService {
    private FormationRepository formationRepository;
    @Override
    public Formation addFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Formation editFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public List<Formation> selectAllFormation() {
        return formationRepository.findAll();
    }

    @Override
    public Formation SelectFormationById(int formationId) {
        return formationRepository.findById(formationId).get();
    }

    @Override
    public void deleteFormationById(int formationId) {
        formationRepository.deleteById(formationId);

    }

    @Override
    public void deleteAllFormations() {
        formationRepository.deleteAll();

    }
}
