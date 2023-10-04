package com.gabriel.auth.controller;

import com.gabriel.auth.domain.products.ProductRequestDTO;
import com.gabriel.auth.domain.products.ProductResponseDTO;
import com.gabriel.auth.services.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO productRequestDTO){
        log.info("passou!");
        return ResponseEntity.ok().body(productService.create(productRequestDTO));
    }

    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = productService.findAll().stream().map(ProductResponseDTO::new).toList();
        return ResponseEntity.ok(productList);
    }
}
