package com.telusko.ProductSpringWeb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    
    Product findByName(String name);

    List<Product> findByPlace(String place);

    default List<Product> findByText(String text) {
        return this.findAll().stream()
            .filter(p -> p.getName().toLowerCase().contains(text.toLowerCase()) ||
                         p.getType().toLowerCase().contains(text.toLowerCase()) ||
                         p.getPlace().toLowerCase().contains(text.toLowerCase()))
            .toList();
    }
}
