package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Formation;
import com.example.pi5infini.DAO.Entities.Instrument;

import java.util.List;

public interface IInstrumentService {
    Instrument addInstruemnt (Instrument instrument);
    Instrument editInstrument (Instrument instrument);
    List<Instrument> selectAllInstrument();
    Instrument SelectInstrumentById(int instrumentId);
    void deleteInstrumentById(int instrumentId);
    void deleteAllInstruments();
}
