package com.example.pi5infini.Services.Interfaces;

import com.example.pi5infini.DAO.Entities.Strategie;
import com.example.pi5infini.DAO.Entities.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction addTransaction (Transaction transaction);
    Transaction editTransacation (Transaction transaction);
    List<Transaction> selectAllTransaction();
    Transaction SelectTransactionById(int transactionId);
    void deleteTransactionById(int transactionId);
    void deleteAllTransaction();
}
