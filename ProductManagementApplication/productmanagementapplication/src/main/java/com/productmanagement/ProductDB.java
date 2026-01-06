package com.productmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

public class ProductDB {

    Connection connection = null;

    public ProductDB() {
      try {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5434/telusko", "postgres", "root");

        // Initialize database connection
    } catch (Exception e) {
        e.printStackTrace();
      }
    }

    public void save(Product product) {
        try {
            String insertSQL = "INSERT INTO product (name, type, place, warranty) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getType());
            preparedStatement.setString(3, product.getPlace());
            preparedStatement.setInt(4, product.getWarranty());
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Product> getAll() {
                    List<Product> products = new ArrayList<>();

        try {
            String insertSQL = "select name, type, place, warranty from product";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                product.setType(rs.getString("type"));
                product.setPlace(rs.getString("place"));
                product.setWarranty(rs.getInt("warranty"));
                products.add(product);                
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public Product getProductByName(String name) {
        try {
            String insertSQL = "select name, type, place, warranty from product where name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                product.setType(rs.getString("type"));
                product.setPlace(rs.getString("place"));
                product.setWarranty(rs.getInt("warranty"));
                return product;
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
            return null;

}
public List<Product> getProductByWarehouse(String name) {
    List<Product> products = new ArrayList<>();    
    try {
            String insertSQL = "select name, type, place, warranty from product where place = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                product.setType(rs.getString("type"));
                product.setPlace(rs.getString("place"));
                product.setWarranty(rs.getInt("warranty"));
                products.add(product);
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
            return products;

}
}
