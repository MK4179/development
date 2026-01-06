

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class ProductDB {

    Connection connection = null;

    public ProductDB() {
      try {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5434", "postgres", "root");

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



}
