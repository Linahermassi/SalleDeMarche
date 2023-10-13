package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Ordre;
import com.example.pi5infini.DAO.Repositories.OrdreRepository;
import com.example.pi5infini.Services.Interfaces.IOrdreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdreService implements IOrdreService {
    private OrdreRepository ordreRepository;
    @Override
    public Ordre addOrdre(Ordre ordre) {
        return ordreRepository.save(ordre);
    }

    @Override
    public Ordre editOrdre(Ordre ordre) {
        return ordreRepository.save(ordre);
    }

    @Override
    public List<Ordre> selectAllOrdre() {
        return ordreRepository.findAll();
    }

    @Override
    public Ordre SelectOrdreById(int ordreId) {
        return ordreRepository.findById(ordreId).get();
    }

    @Override
    public void deleteOrdreById(int OrdreId) {
        ordreRepository.deleteById(OrdreId);
    }

    @Override
    public void deleteAllOrdres() {
        ordreRepository.deleteAll();
    }
}
