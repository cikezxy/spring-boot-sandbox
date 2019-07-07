package com.cikezxy.springbootsandbox.jpa.repository;


import com.cikezxy.springbootsandbox.jpa.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
