package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Strategie;
import com.example.pi5infini.Services.Classes.StrategieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Strategie")
@CrossOrigin("*")
public class StrategieController {
    private StrategieService strategieService;
    @PostMapping("/ajouterStrategie")
    public ResponseEntity<String> addStrategie(@RequestBody Strategie strategie){
        strategieService.addStrategie(strategie);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierStrategie")
    public ResponseEntity<String> editStrategie(@RequestBody Strategie strategie){
        strategieService.editStrategie(strategie);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Strategie> afficherAll(){
        return strategieService.selectAllStrategie();
    }
    @GetMapping("/afficherStrategieById/{strategieId}")
    public Strategie afficherStrategieById(@PathVariable int strategieId ) {
        return strategieService.SelectStrategieById(strategieId);
    }
    @DeleteMapping("/SupprimerStrategietById/{strategieId}")
    public ResponseEntity<String> supprimerStrategieById(@PathVariable int strategieId){
        strategieService.deletestrategieById(strategieId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        strategieService.deleteAllStartegie();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
