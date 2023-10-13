package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Ordre;
import com.example.pi5infini.Services.Interfaces.IOrdreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Ordre")
@CrossOrigin("*")
public class OrdreRestController {
    private IOrdreService iOrdreService;
    @PostMapping("/ajouterOrdre")
    public ResponseEntity<String> addOrdre(@RequestBody Ordre ordre){
        iOrdreService.addOrdre(ordre);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierOrdre")
    public ResponseEntity<String> editOrdre(@RequestBody Ordre ordre){
        iOrdreService.editOrdre(ordre);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Ordre> afficherAll(){
        return iOrdreService.selectAllOrdre();
    }
    @GetMapping("/afficherOrdreById/{ordreId}")
    public Ordre afficherOrdreById(@PathVariable int ordreId ) {

        return iOrdreService.SelectOrdreById(ordreId);
    }
    @DeleteMapping("/SupprimerOrdreById/{ordreId}")
    public ResponseEntity<String> supprimerordreById(@PathVariable int ordreId){
        iOrdreService.SelectOrdreById(ordreId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        iOrdreService.deleteAllOrdres();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
