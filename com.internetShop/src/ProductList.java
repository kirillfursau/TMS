import java.util.ArrayList;

public class ProductList {
    public static ArrayList<Product> products = new ArrayList<>();

    public ProductList() {
        products.add(new Product("Coffe", 100));
        products.add(new Product("Tea", 140));
        products.add(new Product("Milk", 70));
        products.add(new Product("Fanta", 90));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
