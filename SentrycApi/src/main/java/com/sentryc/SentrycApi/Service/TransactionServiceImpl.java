package com.sentryc.SentrycApi.Service;

import com.sentryc.SentrycApi.Dto.TransactionDTO;
import com.sentryc.SentrycApi.Entity.Transaction;
import com.sentryc.SentrycApi.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements  TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public Transaction createTransaction(TransactionDTO transactionDTO) {

        Transaction transaction = new Transaction();
        transaction.setType(transactionDTO.getType());
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setCurrency(transactionDTO.getCurrency());
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction getTransactionById(Integer id) {

        Optional<Transaction> transactionOptional = transactionRepository.findById(id);
        return transactionOptional.orElse(null);
    }

    @Override
    public List<Transaction> getAllTransactions() {

        return transactionRepository.findAll();
    }

    @Override
    public List<Transaction> getTransactionsByType(String type) {

        return transactionRepository.getTransactionsByType(type);
    }

    @Override
    public List<Transaction> getTransactionByCurrency(String currency) {

        return transactionRepository.getTransactionByCurrency(currency);
    }

}
