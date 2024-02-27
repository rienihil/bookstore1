package com.example.as33.controllers;

import com.example.as33.models.Purchase;
import com.example.as33.models.Role;
import com.example.as33.services.interfaces.PurchaseServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    private final PurchaseServiceInterface service;

    public PurchaseController(PurchaseServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Purchase> getAllPurchases(){
        return service.getAllPurchases();
    }

    @PostMapping("/")
    public Purchase createPurchase(@RequestBody Purchase purchase){
        return service.createPurchase(purchase);
    }
    @DeleteMapping("/{purchase_id}")
    public void deleteRole(@PathVariable("purchase_id") int id){
        service.deletePurchaseById(id);
    }
}
