package com.gabriel.auth.services;

import com.gabriel.auth.domain.products.Product;
import com.gabriel.auth.domain.products.ProductRequestDTO;
import com.gabriel.auth.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product create(ProductRequestDTO productRequestDTO) {
        Product newProduct = new Product(productRequestDTO);
        return productRepository.save(newProduct);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
