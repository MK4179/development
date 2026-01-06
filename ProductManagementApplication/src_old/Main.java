

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();

       
        productService.addProduct(new Product("Transparent Laptop", "Exclusive Electronics", "Warehouse A", 24));
        productService.addProduct(new Product("Laptop", "Semi Exclusive Electronics", "Warehouse A", 24));
        productService.addProduct(new Product("Red Laptop", "Normal Electronics", "Warehouse C", 24));
        productService.addProduct(new Product("White Laptop", "Pro Electronics", "Warehouse D", 24));
        productService.addProduct(new Product("Brown Laptop", "Electronics", "Warehouse E", 24));
        productService.addProduct(new Product("Black Laptop", "Non Exclusive Electronics", "Warehouse E", 24));
        productService.addProduct(new Product("Blue Laptop", "Non Normal Electronics", "Warehouse F", 24));
        productService.addProduct(new Product("Orange Laptop", "Non Pro Electronics", "Warehouse G", 24));

        List<Product> products = productService.getAllProducts();
        System.out.println(products);

                System.out.println("--------------------------------------------------------------------------------------");

        Product searchedProduct = productService.getProductByName("Red Laptop");

                System.out.println(searchedProduct);
                System.out.println("--------------------------------------------------------------------------------------");

                        List<Product> searchedWareHouse = productService.getProductByWarehouse("Warehouse A");
                System.out.println(searchedWareHouse);

                  System.out.println("--------------------------------------------------------------------------------------");

        List<Product> searchedText = productService.getProductsWithText("PRO");
                System.out.println(searchedText);


    }

}
