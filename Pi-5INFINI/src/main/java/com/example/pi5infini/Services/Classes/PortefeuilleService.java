package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Portefeuille;
import com.example.pi5infini.DAO.Repositories.PortefeuilleRepository;
import com.example.pi5infini.Services.Interfaces.IPortefeuilleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PortefeuilleService implements IPortefeuilleService {
    private PortefeuilleRepository portefeuilleRepository;
    @Override
    public Portefeuille addPortefeuille(Portefeuille portefeuille) {
        return portefeuilleRepository.save(portefeuille);
    }

    @Override
    public Portefeuille editPortefeuille(Portefeuille portefeuille) {
        return portefeuilleRepository.save(portefeuille);
    }

    @Override
    public List<Portefeuille> selectAllPortefeuille() {
        return portefeuilleRepository.findAll();
    }

    @Override
    public Portefeuille SelectPortefeuilleById(int portefeuilleId) {
        return portefeuilleRepository.findById(portefeuilleId).get();
    }

    @Override
    public void deletePortefeuilleById(int portefeuilleId) {
        portefeuilleRepository.deleteById(portefeuilleId);
    }

    @Override
    public void deleteAllParametres() {
        portefeuilleRepository.deleteAll();

    }
}
