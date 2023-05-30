package com.sentryc.SentrycApi.Repository;

import com.sentryc.SentrycApi.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> getTransactionsByType(String type);
    List<Transaction> getTransactionByCurrency(String currency);
}
