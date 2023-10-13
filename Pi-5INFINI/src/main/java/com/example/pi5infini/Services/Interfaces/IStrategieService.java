package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Strategie;

import java.util.List;

public interface IStrategieService {
    Strategie addStrategie (Strategie strategie);
    Strategie editStrategie (Strategie strategie);
    List<Strategie> selectAllStrategie();
    Strategie SelectStrategieById(int startegieId);
    void deletestrategieById(int strategieId);
    void deleteAllStartegie();
}
