package homeWork.homeWork10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(0, "Apple", 250);
        Product sinkers = new Product(1, "Sinkers", 15);
        Product banana = new Product(2, "Banana", 20);
        Store store = new Store();
        store.addProduct(sinkers);
        store.addProduct(apple);
        store.addProduct(banana);
        store.allProducts();
        List<Product> prod = new ArrayList<>(store.allProducts());
        Collections.sort(prod);
        for (Product p : prod){
            System.out.println(p);
        }
    }
}
