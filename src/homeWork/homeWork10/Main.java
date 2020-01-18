package homeWork.homeWork10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(0, "Apple", 250);
        Product sinkers = new Product(1, "Sinkers", 15);
        Product banana = new Product(2, "Banana", 20);
        Product pepsi = new Product(5,"pepsi",40);
        Product cola = new Product(5,"cola", 50);
        Store store = new Store();
        store.addProduct(sinkers);
        store.addProduct(apple);
        store.addProduct(pepsi);
        store.addProduct(banana);
        store.printAllProducts();
        List<Product> priceSortList = new ArrayList<>(store.returnAllProducts());
        Collections.sort(priceSortList);
        for (Product p : priceSortList){
            System.out.println(p);
        }
        store.sortByLastAddToList();
        store.printAllProducts();
        store.replaceProduct(cola);
        store.printAllProducts();
    }
}
