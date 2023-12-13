package com.ahmedbenismail.angularproject.repository;
import com.ahmedbenismail.angularproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {



}