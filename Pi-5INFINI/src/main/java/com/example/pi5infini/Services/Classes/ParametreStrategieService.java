package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.ParametreStrategie;
import com.example.pi5infini.DAO.Repositories.ParametreStrategieRepository;
import com.example.pi5infini.Services.Interfaces.IParametreStrategieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParametreStrategieService implements IParametreStrategieService {
    private ParametreStrategieRepository parametreStrategieRepository;
    @Override
    public ParametreStrategie addParametre(ParametreStrategie parametreStrategie) {
        return parametreStrategieRepository.save(parametreStrategie);
    }

    @Override
    public ParametreStrategie editParametre(ParametreStrategie parametreStrategie) {
        return parametreStrategieRepository.save(parametreStrategie);
    }

    @Override
    public List<ParametreStrategie> selectAllParametre() {
        return parametreStrategieRepository.findAll();
    }

    @Override
    public ParametreStrategie SelectParametreById(int parametreId) {
        return parametreStrategieRepository.findById(parametreId).get();
    }

    @Override
    public void deleteParametreById(int parametreId) {
        parametreStrategieRepository.deleteById(parametreId);

    }

    @Override
    public void deleteAllParametres() {
        parametreStrategieRepository.deleteAll();

    }
}
