package homeWork.homeWork10;

import homeWork.homeWork8.MyException;

import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.*;

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
            int numberDeleteProduct = 0;
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).getId() == id) {
                    findId = true;
                    numberDeleteProduct = i;
                    break;
                }
            }
            if (!findId) {
                throw new MyException();
            }
            Products.remove(numberDeleteProduct);
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

    void printFirstMenu() {
        System.out.println("1. Вывод всех товаров");
        System.out.println("2. Добавление товара");
        System.out.println("3. Удаление товара");
        System.out.println("4. Редактирование товара");
        System.out.println("5. Выход");
    }

    void printSecondMenu() {
        System.out.println("1. По цене(возрастание)");
        System.out.println("2. По цене(убывание)");
        System.out.println("3. По добавлению(сначала новые, потом более старые)");
    }


    public void start() {
        Scanner sc = new Scanner(System.in);
        try {
            int key;
            do {
                printFirstMenu();
                System.out.print("Введите номер меню: ");
                key = sc.nextInt();
                switch (key) {
                    case 1:
                        printSecondMenu();
                        System.out.print("Введите номер меню: ");
                        key = sc.nextInt();
                        switch (key) {
                            case 1:
                                for (Product p : priceSortList()) {
                                    System.out.println(p);
                                }
                                break;
                            case 2:
                                for (int i = Products.size(); i > 0; i--) {
                                    System.out.println(priceSortList().get(i - 1));
                                }
                                break;
                            case 3:
                                for (Product p : sortByLastAddToList()) {
                                    System.out.println(p);
                                }
                                break;
                            default:
                                System.out.println("Вы ввели неверное значение меню...\n");
                        }
                        break;
                    case 2:
                        System.out.print("Введите id товара: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите наименование товара: ");
                        String name = sc.nextLine();
                        System.out.print("Введите цену товара: ");
                        int price = sc.nextInt();
                        Product product = new Product(id, name, price);
                        addProduct(product);
                        break;
                    case 3:
                        System.out.println("Введите id товара: ");
                        int deleteId = sc.nextInt();
                        deleteProduct(deleteId);
                        break;
                    case 4:
                        System.out.println("Введите id товара для редактирования: ");
                        int replaceId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Введите новое наименование товара: ");
                        String replaceName = sc.next();
                        System.out.println("Введите новую цену товара: ");
                        int replacePrice = sc.nextInt();
                        Product replaceProduct = new Product(replaceId, replaceName, replacePrice);
                        replaceProduct(replaceProduct);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 5);
        } catch (InputMismatchException e) {
            System.out.println("Неверный тип данных попробуйте снова");
            start();
        }
    }
}