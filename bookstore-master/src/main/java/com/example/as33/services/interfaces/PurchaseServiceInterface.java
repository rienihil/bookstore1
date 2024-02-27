package com.example.as33.services.interfaces;

import com.example.as33.models.Purchase;

import java.util.List;

public interface PurchaseServiceInterface {
    List<Purchase> getAllPurchases();
    Purchase createPurchase(Purchase purchase);
    void deletePurchaseById(int id);
}
