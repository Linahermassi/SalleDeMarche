package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Formation;
import com.example.pi5infini.Services.Interfaces.IFormationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Formation")
@CrossOrigin("*")
public class FormationController {
    private IFormationService iFormationService;
    @PostMapping("/ajouterFormation")
    public ResponseEntity<String> addFormation(@RequestBody Formation formation){
        iFormationService.addFormation(formation);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierFormation")
    public ResponseEntity<String> editFormation(@RequestBody Formation formation){
        iFormationService.editFormation(formation);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Formation> afficherAll(){
        return iFormationService.selectAllFormation();
    }
    @GetMapping("/afficherFormationById/{formationId}")
    public Formation afficherFormationById(@PathVariable int formationId ) {

        return iFormationService.SelectFormationById(formationId);
    }
    @DeleteMapping("/SupprimerFormationById/{formationId}")
    public ResponseEntity<String> supprimerFormationById(@PathVariable int formationId){
        iFormationService.deleteFormationById(formationId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        iFormationService.deleteAllFormations();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
