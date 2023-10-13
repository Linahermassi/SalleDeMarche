package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Strategie;
import com.example.pi5infini.Services.Interfaces.IStrategieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StrategieService implements IStrategieService {
    @Override
    public Strategie addStrategie(Strategie strategie) {
        return null;
    }

    @Override
    public Strategie editStrategie(Strategie strategie) {
        return null;
    }

    @Override
    public List<Strategie> selectAllStrategie() {
        return null;
    }

    @Override
    public Strategie SelectStrategieById(int startegieId) {
        return null;
    }

    @Override
    public void deletestrategieById(int strategieId) {

    }

    @Override
    public void deleteAllStartegie() {

    }
}
