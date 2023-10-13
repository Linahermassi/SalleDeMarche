package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.IndicateurTechnique;
import com.example.pi5infini.Services.Classes.IndicateurTechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Indicateur")
@CrossOrigin("*")
public class IndicateurTechniqueController {
    private IndicateurTechniqueService indicateurTechniqueService;
    @PostMapping("/ajouterIndicateur")
    public ResponseEntity<String> addIndicateur(@RequestBody IndicateurTechnique indicateurTechnique){
        indicateurTechniqueService.addIndicateur(indicateurTechnique);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierIndicateur")
    public ResponseEntity<String> editIndicateur(@RequestBody IndicateurTechnique indicateurTechnique){
        indicateurTechniqueService.editIndicateur(indicateurTechnique);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<IndicateurTechnique> afficherAll(){
        return indicateurTechniqueService.selectAllIndicateur();
    }
    @GetMapping("/afficherIndicateurById/{indicateurId}")
    public IndicateurTechnique afficherIndicateurById(@PathVariable int indicateurId ) {

        return indicateurTechniqueService.SelectIndicateurById(indicateurId);
    }
    @DeleteMapping("/SupprimerIndicateurById/{indicateurId}")
    public ResponseEntity<String> supprimerIndicateurById(@PathVariable int indicateurId){
        indicateurTechniqueService.deleteIndicateurById(indicateurId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        indicateurTechniqueService.deleteAllIndicateurs();
        return ResponseEntity.ok("Deleted successfully.");
    }

}
