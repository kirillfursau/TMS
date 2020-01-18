package homeWork.homeWork10;

import homeWork.homeWork8.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {
    static List<Product> Products = new ArrayList<>();

    void addProduct(Product product) {
        try {
            for (Product p : Products) {
                if (p.getId() == product.getId()) {
                    throw new MyException();
                }
            }
            System.out.println("Add successful");
            Products.add(product);
        } catch (MyException e) {
            System.out.println("You have product with this id ");
        }
    }

    List<Product> printAllProducts() {
        for (Product p : Products) {
            System.out.println(p.toString());
        }
        System.out.println();
        return Products;
    }

    List<Product> returnAllProducts() {
        return Products;
    }


    void deleteProduct(int id) {
        try {
            boolean findId = false;
            for (Product p : Products) {
                if (p.getId() == id) {
                    findId = true;
                    break;
                }
            }
            if (!findId) {
                throw new MyException();
            }
            Products.remove(id);
            System.out.println("Delete product successful");
        } catch (MyException e) {
            System.out.println("You dont have product with this id");
        }
    }

    void replaceProduct(Product product) {
        try {
            boolean findId = false;
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).getId() == product.getId()) {
                    Products.set(i, product);
                    findId = true;
                    break;
                }
            }
            if (!findId) {
                throw new MyException();
            }
            System.out.println("Replace product successful");
        } catch (MyException e) {
            System.out.println("You dont have product with this id");
        }
    }

    List<Product> priceSortList() {
        List<Product> priceSortList = new ArrayList<>(Products);
        Collections.sort(priceSortList);
        return priceSortList;
    }

    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = Products.size(); i > 0; i--) {
            sortByLastAddToList.add(Products.get(i - 1));
        }
        return sortByLastAddToList;
    }
}
