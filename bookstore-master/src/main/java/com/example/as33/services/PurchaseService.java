package com.example.as33.services;

import com.example.as33.models.Purchase;
import com.example.as33.repositories.PurchaseRepositoryInterface;
import com.example.as33.services.interfaces.PurchaseServiceInterface;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService  implements PurchaseServiceInterface {
    private final PurchaseRepositoryInterface repo;

    public PurchaseService(PurchaseRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Purchase> getAllPurchases() {
        return repo.findAll(Sort.by("id"));
    }

    @Override
    public Purchase createPurchase(Purchase purchase) {
        return repo.saveAndFlush(purchase);
    }

    @Override
    public void deletePurchaseById(int id) {
        repo.deleteById(id);
    }
}
