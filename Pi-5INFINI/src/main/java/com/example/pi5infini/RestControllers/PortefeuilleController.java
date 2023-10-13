package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Portefeuille;
import com.example.pi5infini.Services.Classes.PortefeuilleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Portefeuille")
@CrossOrigin("*")
public class PortefeuilleController {
    private PortefeuilleService portefeuilleService;
    @PostMapping("/ajouterPortefeuille")
    public ResponseEntity<String> addPortefeuille(@RequestBody Portefeuille portefeuille){
        portefeuilleService.addPortefeuille(portefeuille);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierPortefeuille")
    public ResponseEntity<String> editPortefeuille(@RequestBody Portefeuille portefeuille){
        portefeuilleService.editPortefeuille(portefeuille);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Portefeuille> afficherAll(){
        return portefeuilleService.selectAllPortefeuille();
    }
    @GetMapping("/afficherPortefeuilleById/{portefeuilleId}")
    public Portefeuille afficherPortefeuilleById(@PathVariable int portefeuilleId ) {
        return portefeuilleService.SelectPortefeuilleById(portefeuilleId);
    }
    @DeleteMapping("/SupprimerPortefeuilletById/{portefeuilleId}")
    public ResponseEntity<String> supprimerPortefeuilleById(@PathVariable int portefeuilleId){
        portefeuilleService.deletePortefeuilleById(portefeuilleId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        portefeuilleService.deleteAllParametres();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
