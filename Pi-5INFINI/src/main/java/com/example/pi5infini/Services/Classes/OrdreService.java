package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Ordre;
import com.example.pi5infini.Services.Interfaces.IOrdreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrdreService implements IOrdreService {
    @Override
    public Ordre addOrdre(Ordre ordre) {
        return null;
    }

    @Override
    public Ordre editOrdre(Ordre ordre) {
        return null;
    }

    @Override
    public List<Ordre> selectAllOrdre() {
        return null;
    }

    @Override
    public Ordre SelectOrdreById(int ordreId) {
        return null;
    }

    @Override
    public void deleteOrdreById(int OrdreId) {

    }

    @Override
    public void deleteAllContracts() {

    }
}
