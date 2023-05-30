package com.sentryc.SentrycApi.Service;

import com.sentryc.SentrycApi.Dto.TransactionDTO;
import com.sentryc.SentrycApi.Entity.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(TransactionDTO transactionDTO);

    Transaction getTransactionById(Integer id);

    List<Transaction> getAllTransactions();

    List<Transaction> getTransactionsByType(String type);

    List<Transaction> getTransactionByCurrency(String currency);

}
