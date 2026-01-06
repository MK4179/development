package com.telusko.ProductSrping;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSrpingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductSrpingApplication.class, args);

		ProductService productService = context.getBean(ProductService.class);
		List<Product> products = productService.getAllProducts();
		System.out.println("Products fetched from database:");
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
