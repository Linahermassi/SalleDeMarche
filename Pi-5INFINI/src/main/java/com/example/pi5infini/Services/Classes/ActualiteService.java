package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Actualite;
import com.example.pi5infini.DAO.Repositories.ActualiteRepository;
import com.example.pi5infini.Services.Interfaces.IActualiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActualiteService implements IActualiteService {
    private ActualiteRepository actualiteRepository;
    @Override
    public Actualite addActualite(Actualite actualite) {
        return actualiteRepository.save(actualite);
    }

    @Override
    public Actualite editActualite(Actualite actualite) {
        return  actualiteRepository.save(actualite);
    }

    @Override
    public List<Actualite> selectAllActualite() {
        return actualiteRepository.findAll();
    }

    @Override
    public Actualite SelectActualiteById(int actualiteId) {
        return actualiteRepository.findById(actualiteId).get();
    }

    @Override
    public void deleteActualiteById(int actualiteId) {
        actualiteRepository.deleteById(actualiteId);
    }

    @Override
    public void deleteAllActualites() {
        actualiteRepository.deleteAll();

    }
}
