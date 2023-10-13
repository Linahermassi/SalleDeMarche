package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Actualite;
import com.example.pi5infini.Services.Interfaces.IActualiteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Actualite")
@CrossOrigin("*")
public class ActualiteController {
    private IActualiteService iActualiteService;
    @PostMapping("/ajouterActualite")
    public ResponseEntity<String> addActualite(@RequestBody Actualite actualite){
        iActualiteService.addActualite(actualite);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierActualite")
    public ResponseEntity<String> editActualite(@RequestBody Actualite actualite){
        iActualiteService.editActualite(actualite);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Actualite> afficherAll(){
        return iActualiteService.selectAllActualite();
    }
    @GetMapping("/afficherActualiteById/{actualiteId}")
    public Actualite afficherActualiteById(@PathVariable int actualiteId ) {

        return iActualiteService.SelectActualiteById(actualiteId);
    }
    @DeleteMapping("/SupprimerActualiteById/{actualiteId}")
    public ResponseEntity<String> supprimerActualiteById(@PathVariable int actualiteId){
        iActualiteService.deleteActualiteById(actualiteId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        iActualiteService.deleteAllActualites();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
