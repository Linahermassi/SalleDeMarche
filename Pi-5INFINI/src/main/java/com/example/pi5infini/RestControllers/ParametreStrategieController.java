package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.ParametreStrategie;
import com.example.pi5infini.Services.Classes.ParametreStrategieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Parametre")
@CrossOrigin("*")
public class ParametreStrategieController {
    private ParametreStrategieService parametreStrategieService;
    @PostMapping("/ajouterParametre")
    public ResponseEntity<String> addParametre(@RequestBody ParametreStrategie parametre){
        parametreStrategieService.addParametre(parametre);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierParametre")
    public ResponseEntity<String> editParametre(@RequestBody ParametreStrategie parametre){
        parametreStrategieService.editParametre(parametre);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<ParametreStrategie> afficherAll(){
        return parametreStrategieService.selectAllParametre();
    }
    @GetMapping("/afficherParametreById/{parametreId}")
    public ParametreStrategie afficherParametreById(@PathVariable int parametreId ) {
        return parametreStrategieService.SelectParametreById(parametreId);
    }
    @DeleteMapping("/SupprimerParametretById/{parametreId}")
    public ResponseEntity<String> supprimerParametreById(@PathVariable int parametreId){
        parametreStrategieService.deleteParametreById(parametreId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        parametreStrategieService.deleteAllParametres();
        return ResponseEntity.ok("Deleted successfully.");
    }

}
