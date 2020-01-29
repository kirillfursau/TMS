package homeWork.homeWork10WithStreamAndLambda;

import java.util.*;
import java.util.stream.Collectors;

import static lessons.lesson11.DateUtils.printNowDate;


public class Store {
    private final List<Product> PRODUCTS = new ArrayList<>();


    void addProduct(Product product) {
        if (PRODUCTS.indexOf(product) != -1) {
            System.out.println("You have product with this id.");
        } else {
            System.out.println("Add successful");
            PRODUCTS.add(product);
        }
    }


    void printAllProducts() {
        PRODUCTS.stream()
                .forEach(product -> System.out.println(product));
    }

    List<Product> getAllProducts() {
        return PRODUCTS;
    }


    void deleteProduct(int id) {
        boolean deleteProduct = false;
        for (int i = 0; i < PRODUCTS.size(); i++) {
            if (PRODUCTS.get(i).getId() == id) {
                PRODUCTS.remove(i);
                deleteProduct = true;
                System.out.println("Delete product successful");
                break;
            }
        }
        if (!deleteProduct) {
            System.out.println("You dont have product with this id");
        }
    }

    void replaceProduct(Product product) {
        if (PRODUCTS.indexOf(product) != -1) {
            PRODUCTS.set(PRODUCTS.indexOf(product), product);
            System.out.println("Replace product successful");
        } else {
            System.out.println("You dont have product with this id");
        }
    }

    List<Product> priceSortList() {
        return PRODUCTS.stream()
                .sorted((product1, product2) -> product2.getPrice() - product1.getPrice())
                .collect(Collectors.toList());
    }

    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = PRODUCTS.size(); i > 0; i--) {
            sortByLastAddToList.add(PRODUCTS.get(i - 1));
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
            String key;
            do {
                System.out.print("Текущая дата и время : ");
                printNowDate();
                printFirstMenu();
                System.out.print("Введите номер меню: ");
                key = sc.nextLine().trim();
                switch (key) {
                    case "1":
                        printSecondMenu();
                        System.out.print("Введите номер меню: ");
                        key = sc.nextLine().trim();
                        switch (key) {
                            case "1":
                                for (int i = PRODUCTS.size(); i > 0; i--) {
                                    System.out.println(priceSortList().get(i - 1));
                                }
                                break;
                            case "2":
                                priceSortList().stream()
                                        .forEach(product -> System.out.println(product));
                                break;
                            case "3":
                                sortByLastAddToList().stream()
                                        .forEach(product -> System.out.println(product));
                                break;
                            default:
                                System.out.println("Вы ввели неверное значение меню...\n");
                        }
                        break;
                    case "2":
                        System.out.print("Введите id товара: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите наименование товара: ");
                        String name = sc.nextLine();
                        System.out.print("Введите цену товара: ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        Product product = new Product(id, name, price);
                        addProduct(product);
                        break;
                    case "3":
                        System.out.print("Введите id товара: ");
                        int deleteId = sc.nextInt();
                        sc.nextLine();
                        deleteProduct(deleteId);
                        break;
                    case "4":
                        System.out.print("Введите id товара для редактирования: ");
                        int replaceId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите новое наименование товара: ");
                        String replaceName = sc.next();
                        System.out.print("Введите новую цену товара: ");
                        int replacePrice = sc.nextInt();
                        sc.nextLine();
                        Product replaceProduct = new Product(replaceId, replaceName, replacePrice);
                        replaceProduct(replaceProduct);
                        break;
                    case "5":
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню.\n");
                }
            } while (key != "5");
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверное значение. Необходимо ввести цифу\n");
            start();
        }
    }
}

