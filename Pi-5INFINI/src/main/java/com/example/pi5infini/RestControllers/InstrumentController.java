package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Instrument;
import com.example.pi5infini.Services.Classes.InstrumentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Instrument")
@CrossOrigin("*")
public class InstrumentController {
    private InstrumentService instrumentService;
    @PostMapping("/ajouterInstrument")
    public ResponseEntity<String> addInstrument(@RequestBody Instrument instrument){
        instrumentService.addInstruemnt(instrument);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierInstrument")
    public ResponseEntity<String> editInstrument(@RequestBody Instrument instrument){
        instrumentService.editInstrument(instrument);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Instrument> afficherAll(){
        return instrumentService.selectAllInstrument();
    }
    @GetMapping("/afficherInstrumentById/{instrumentId}")
    public Instrument afficherIndicateurById(@PathVariable int instrumentId ) {

        return instrumentService.SelectInstrumentById(instrumentId);
    }
    @DeleteMapping("/SupprimerInstrumentById/{instrumentId}")
    public ResponseEntity<String> supprimerInstrumentById(@PathVariable int instrumentId){
        instrumentService.deleteInstrumentById(instrumentId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        instrumentService.deleteAllInstruments();
        return ResponseEntity.ok("Deleted successfully.");
    }

}
