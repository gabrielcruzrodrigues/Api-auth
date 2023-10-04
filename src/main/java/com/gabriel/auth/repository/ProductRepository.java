package com.gabriel.auth.repository;

import com.gabriel.auth.domain.products.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
