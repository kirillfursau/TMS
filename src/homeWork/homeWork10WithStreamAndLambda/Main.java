package homeWork.homeWork10WithStreamAndLambda;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(0, "Apple", 250);
        Product sinkers = new Product(1, "Sinkers", 15);
        Product banana = new Product(2, "Banana", 20);
        Product pepsi = new Product(5, "Pepsi", 40);
        Product cola = new Product(5, "Cola", 50);
        Store store = new Store();
        store.addProduct(sinkers);
        store.addProduct(apple);
        store.addProduct(pepsi);
        store.addProduct(banana);
        store.printAllProducts();
        store.priceSortList().stream()
                .forEach(product -> System.out.println(product));
        System.out.println();
        store.deleteProduct(1);
        System.out.println();
        store.replaceProduct(cola);
        store.printAllProducts();
        store.sortByLastAddToList().stream()
                .forEach(product -> System.out.println(product));
        System.out.println(pepsi.equals(cola));
    }
}
