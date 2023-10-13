package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.IndicateurTechnique;
import com.example.pi5infini.DAO.Repositories.IndicateurTechniqueRepository;
import com.example.pi5infini.Services.Interfaces.IIndicateurTechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IndicateurTechniqueService implements IIndicateurTechniqueService {
    private IndicateurTechniqueRepository indicateurTechniqueRepository;
    @Override
    public IndicateurTechnique addIndicateur(IndicateurTechnique indicateurTechnique) {
        return indicateurTechniqueRepository.save(indicateurTechnique);
    }

    @Override
    public IndicateurTechnique editIndicateur(IndicateurTechnique indicateurTechnique) {
        return indicateurTechniqueRepository.save(indicateurTechnique);
    }

    @Override
    public List<IndicateurTechnique> selectAllIndicateur() {
        return indicateurTechniqueRepository.findAll();
    }

    @Override
    public IndicateurTechnique SelectIndicateurById(int indicateurId) {
        return indicateurTechniqueRepository.findById(indicateurId).get();
    }

    @Override
    public void deleteIndicateurById(int indicateurId) {
        indicateurTechniqueRepository.deleteById(indicateurId);

    }

    @Override
    public void deleteAllIndicateurs() {
        indicateurTechniqueRepository.deleteAll();

    }
}
