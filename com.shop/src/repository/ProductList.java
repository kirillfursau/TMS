package repository;

import model.Product;

import java.util.ArrayList;

public class ProductList {
    public static ArrayList<Product> products = new ArrayList<>();
    static int counter = 0;

    public ProductList() {
        if (counter == 0) {
            products.add(new Product("Coffee", 100));
            products.add(new Product("Tea", 140));
            products.add(new Product("Milk", 70));
            products.add(new Product("Fanta", 90));
            counter++;
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
