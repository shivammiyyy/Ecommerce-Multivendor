package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.model.Seller;
import com.Ecommerce_Multivendor.Backend.model.Transaction;
import com.Ecommerce_Multivendor.Backend.service.SellerService;
import com.Ecommerce_Multivendor.Backend.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transaction")
public class TransactionController {

    private final TransactionService transactionService;
    private final SellerService sellerService;


    @GetMapping("/seller")
    public ResponseEntity<List<Transaction>> getTransactionBySeller(
                @RequestHeader("Authorization") String jwt) throws Exception{

        Seller seller = sellerService.getSellerProfile(jwt);
        List<Transaction> transactions = transactionService.geTransactionsBySellerId(seller);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransaction(){
        List<Transaction> transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

}
