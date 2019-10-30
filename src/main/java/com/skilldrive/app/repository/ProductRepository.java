package com.skilldrive.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilldrive.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}