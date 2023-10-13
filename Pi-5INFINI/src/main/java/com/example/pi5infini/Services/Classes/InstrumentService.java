package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Instrument;
import com.example.pi5infini.DAO.Repositories.InstrumentRepository;
import com.example.pi5infini.Services.Interfaces.IInstrumentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InstrumentService implements IInstrumentService {
    private InstrumentRepository instrumentRepository;
    @Override
    public Instrument addInstruemnt(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

    @Override
    public Instrument editInstrument(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

    @Override
    public List<Instrument> selectAllInstrument() {
        return instrumentRepository.findAll();
    }

    @Override
    public Instrument SelectInstrumentById(int instrumentId) {
        return instrumentRepository.findById(instrumentId).get();
    }

    @Override
    public void deleteInstrumentById(int instrumentId) {
        instrumentRepository.deleteById(instrumentId);

    }

    @Override
    public void deleteAllInstruments() {
        instrumentRepository.deleteAll();

    }
}
