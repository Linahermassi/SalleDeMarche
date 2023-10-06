package com.example.pi5infini.DAO.Repositories;

import com.example.pi5infini.DAO.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
