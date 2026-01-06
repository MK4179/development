package com.telusko.ProductSrping;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public Product getProductByName(String name) {
        List<Product> products = db.findAll();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // or throw an exception if preferred
    }

    // public Product getProductByName(String name) {
    //     ProductDB db = new ProductDB();
    //     return db.getProductByName(name);
    //    // return products.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findAny().orElse(null); // or throw an exception if preferred
    // }

    // public List<Product> getProductByWarehouse(String warehouse) {
    //  ProductDB db = new ProductDB();
    //     return db.getProductByWarehouse(warehouse);
    // }

    // public List<Product> getProductsWithText(String text) {
    //     return products.stream().filter(p -> p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase()) || p.getPlace().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
    // }

}
