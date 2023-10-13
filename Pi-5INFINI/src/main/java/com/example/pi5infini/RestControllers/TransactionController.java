package com.example.pi5infini.RestControllers;
import com.example.pi5infini.DAO.Entities.Transaction;
import com.example.pi5infini.Services.Classes.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Transaction")
@CrossOrigin("*")
public class TransactionController {
    private TransactionService transactionService;
    @PostMapping("/ajouterTransaction")
    public ResponseEntity<String> addTransaction(@RequestBody Transaction transaction){
        transactionService.addTransaction(transaction);
        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/modifierTransaction")
    public ResponseEntity<String> editTransaction(@RequestBody Transaction transaction){
        transactionService.editTransacation(transaction);
        return ResponseEntity.ok("Edited successfully.");
    }
    @GetMapping("/afficherAll")
    public List<Transaction> afficherAll(){
        return transactionService.selectAllTransaction();
    }
    @GetMapping("/afficherTransactionById/{transactionId}")
    public Transaction afficherTransactionById(@PathVariable int transactionId ) {
        return transactionService.SelectTransactionById(transactionId);
    }
    @DeleteMapping("/SupprimerTransactiontById/{transactionId}")
    public ResponseEntity<String> supprimerTransactionById(@PathVariable int transactionId){
        transactionService.deleteTransactionById(transactionId);
        return ResponseEntity.ok("Deleted successfully.");
    }
    @DeleteMapping("/SupprimerAll")
    public ResponseEntity<String> SupprimerAll() {
        transactionService.deleteAllTransaction();
        return ResponseEntity.ok("Deleted successfully.");
    }
}
