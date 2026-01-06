

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {


    List<Product> products = new ArrayList<>();

    
    public ProductService() {
        // Constructor logic if needed
    }

    public void addProduct(Product product) {
        ProductDB db = new ProductDB();
        db.save(product);
        //products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductByName(String name) {
    
        return products.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findAny().orElse(null); // or throw an exception if preferred
    }

    public List<Product> getProductByWarehouse(String warehouse) {
        return products.stream().filter(p -> p.getPlace().equalsIgnoreCase(warehouse)).collect(Collectors.toList()); // or throw an exception if preferred
    }

    public List<Product> getProductsWithText(String text) {
        return products.stream().filter(p -> p.getName().toLowerCase().contains(text.toLowerCase()) || p.getType().toLowerCase().contains(text.toLowerCase()) || p.getPlace().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());
    }

}
