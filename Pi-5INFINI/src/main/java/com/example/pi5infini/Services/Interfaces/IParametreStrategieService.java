package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Instrument;
import com.example.pi5infini.DAO.Entities.ParametreStrategie;

import java.util.List;

public interface IParametreStrategieService {
    ParametreStrategie addParametre (ParametreStrategie parametreStrategie);
    ParametreStrategie editParametre (ParametreStrategie parametreStrategie);
    List<ParametreStrategie> selectAllParametre();
    ParametreStrategie SelectParametreById(int parametreId);
    void deleteParametreById(int parametreId);
    void deleteAllParametres();
}
