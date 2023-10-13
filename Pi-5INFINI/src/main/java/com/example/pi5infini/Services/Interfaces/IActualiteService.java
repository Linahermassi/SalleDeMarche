package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Actualite;

import java.util.List;

public interface IActualiteService {
    Actualite addActualite (Actualite actualite);
    Actualite editActualite (Actualite actualite);
    List<Actualite> selectAllActualite();
    Actualite SelectActualiteById(int actualiteId);
    void deleteActualiteById(int actualiteId);
    void deleteAllActualites();
}
