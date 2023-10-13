package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Utilisateur;
import com.example.pi5infini.Services.Classes.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Utilisateur")
@CrossOrigin("*")
public class UtilisateurController {
    private UtilisateurService utilisateurService;
    @PostMapping("/ajouterUtilisateur")
    public ResponseEntity<String> addUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurService.addUtilisateur(utilisateur);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierUtilisateur")
    public ResponseEntity<String> editUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurService.editUtilisateur(utilisateur);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Utilisateur> afficherAll(){
        return utilisateurService.selectAllUtilisateur();
    }
    @GetMapping("/afficherUtilisateurById/{utilisateurId}")
    public Utilisateur afficherUtilisateurById(@PathVariable int utilisateurId ) {
        return utilisateurService.SelectUtilisateurById(utilisateurId);
    }
    @DeleteMapping("/SupprimerTransactiontById/{utilisateurId}")
    public ResponseEntity<String> supprimerUtilisateurById(@PathVariable int utilisateurId){
        utilisateurService.deleteUtilisateurById(utilisateurId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        utilisateurService.deleteAllUtilisateur();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
