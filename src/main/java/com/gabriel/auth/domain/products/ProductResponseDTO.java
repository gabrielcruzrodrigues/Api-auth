package com.gabriel.auth.domain.products;

public record ProductResponseDTO (String id, String name, Integer price) {

    public ProductResponseDTO(Product product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
