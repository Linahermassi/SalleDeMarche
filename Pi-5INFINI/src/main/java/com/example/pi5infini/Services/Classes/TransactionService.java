package com.example.pi5infini.Services.Classes;

import com.example.pi5infini.DAO.Entities.Transaction;
import com.example.pi5infini.DAO.Repositories.TransactionRepository;
import com.example.pi5infini.Services.Interfaces.ITransactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService implements ITransactionService {
    private TransactionRepository transactionRepository;
    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction editTransacation(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> selectAllTransaction() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction SelectTransactionById(int transactionId) {
        return transactionRepository.findById(transactionId).get();
    }

    @Override
    public void deleteTransactionById(int transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public void deleteAllTransaction() {
        transactionRepository.deleteAll();
    }
}
