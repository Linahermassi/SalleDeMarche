package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Ordre;

import java.util.List;

public interface IOrdreService {
    Ordre addOrdre (Ordre ordre);
    Ordre editOrdre (Ordre ordre);
    List<Ordre> selectAllOrdre();
    Ordre SelectOrdreById(int ordreId);
    void deleteOrdreById(int OrdreId);
    void deleteAllOrdres();
}
