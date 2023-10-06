package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.DAO.Entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument,Integer> {
}
