package com.telusko.ProductSpringWeb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class ProductService {

    public ProductService() {
        // Constructor logic if needed
    }
    
    @Autowired
    private ProductDB db;

    public void show() {
        System.out.println("Product Service is running...");
    }

    // public void addProduct(Product product) {
    //     ProductDB db = new ProductDB();
    //     db.save(product);
    //     //products.add(product);
    // }

    public List<Product> getAllProducts() {
       return db.findAll();
    }

    public Product getProductById(int id) {
        return db.findById(id).orElse(null);
    }

    public void deleteProduct(int id) {
        db.deleteById(id);
    }

    public void updateProduct(int id, Product updatedProduct) {
        updatedProduct.setId(id);
        db.save(updatedProduct);
    }

    @PersistenceContext private EntityManager entityManager; 
    
    @Transactional public void refreshContext() { entityManager.clear(); } // clears persistence context }

    // public Product getProductByName(String name) {
    //     List<Product> products = db.findAll();
    //     for (Product product : products) {
    //         if (product.getName().equalsIgnoreCase(name)) {
    //             return product;
    //         }
    //     }
    //     return null; // or throw an exception if preferred
    // }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }

    @Transactional
    public Product addProduct(Product product) {
        if (product.getId() != null && db.existsById(product.getId())) { // Update existing 
         return db.save(product); } else { 
            product.setId(null); // force JPA to generate a new ID 
            return db.save(product); }
    }

    public List<Product> getProductByWarehouse(String warehouse) {
        return db.findByPlace(warehouse);
    }

    public List<Product> getProductsWithText(String text) {
    return db.findByText(text);
    }   
}
