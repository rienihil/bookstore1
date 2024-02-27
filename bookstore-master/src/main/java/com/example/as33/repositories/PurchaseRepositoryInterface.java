package com.example.as33.repositories;

import com.example.as33.models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepositoryInterface extends JpaRepository<Purchase, Integer> {
}
