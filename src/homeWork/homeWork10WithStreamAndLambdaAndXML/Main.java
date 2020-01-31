package homeWork.homeWork10WithStreamAndLambdaAndXML;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(0, "Apple", 250);
        Product sinkers = new Product(1, "Sinkers", 15);
        Product banana = new Product(2, "Banana", 20);
        Product pepsi = new Product(5, "Pepsi", 40);
        Product cola = new Product(6, "Cola", 30);
        Store store = new Store();
        store.addProduct(apple);
        store.addProduct(sinkers);
        store.addProduct(banana);
        store.addProduct(pepsi);
        store.addProduct(cola);
        store.printAllProducts();
        System.out.println();
        store.priceSortList().stream()
                .forEach(product -> System.out.println(product));
        System.out.println();
        store.sortByLastAddToList().stream()
                .forEach(product -> System.out.println(product));
    }
}
