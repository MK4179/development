package com.telusko.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    @Autowired
    private ProductService service;
 
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @GetMapping("/product/warehouse/{warehouseName}")
    public List<Product> getProductByWareHouse(@PathVariable String warehouseName) {
        return service.getProductByWarehouse(warehouseName);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {        
        service.addProduct(product);
    }

    @GetMapping("/product/text/{text}")
    public List<Product> getProductsWithText(@PathVariable String text) {
        return service.getProductsWithText(text);
    }
    
    
}
