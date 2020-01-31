package homeWork.homeWork10WithStreamAndLambdaAndXML;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import lessons.lesson13.Catalog;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static lessons.lesson11.DateUtils.printNowDate;

@XmlRootElement
public class Store {
    private List<Product> products = new ArrayList<>();
    private static final String FILEPATH
            = "/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork10WithStreamAndLambdaAndXML/xmlProducts.xml";

    public Store() {
    }

    public List<Product> getPRODUCTS() {
        return products;
    }

    public void setPRODUCTS(List<Product> PRODUCTS) {
        this.products = PRODUCTS;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getFILEPATH() {
        return FILEPATH;
    }


    public void addProduct(Product product) {
        try {
            if (readFromXml().getProductsList().indexOf(product) != -1) {
                System.out.println("You have product with this id.");
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Add successful");
            products.add(product);
            convertToXml();
        }
    }

    public void convertToXml() {
        try {
            XmlProducts xmlProducts = new XmlProducts(products);
            JAXBContext context = JAXBContext.newInstance(XmlProducts.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(xmlProducts, new File(FILEPATH));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public XmlProducts readFromXml() {
        try {
            File file = new File(FILEPATH);
            JAXBContext context = JAXBContext.newInstance(XmlProducts.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (XmlProducts) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            System.out.println("У вас в магазине нет товаров");
            return null;
        }
    }


    public void printAllProducts() {
        readFromXml().getProductsList().stream()
                .forEach(product -> System.out.println(product));
    }

    List<Product> getAllProducts() {
        return readFromXml().getProductsList();
    }


    public void deleteProduct(int id) {
        boolean deleteProduct = false;
        for (int i = 0; i < readFromXml().getProductsList().size(); i++) {
            if (readFromXml().getProductsList().get(i).getId() == id) {
                products = readFromXml().getProductsList();
                products.remove(i);
                convertToXml();
                deleteProduct = true;
                System.out.println("Delete product successful");
                break;
            }
        }
        if (!deleteProduct) {
            System.out.println("You dont have product with this id");
        }
    }

    public void replaceProduct(Product product) {
        if (readFromXml().getProductsList().indexOf(product) != -1) {
            products = readFromXml().getProductsList();
            products.set(products.indexOf(product), product);
            convertToXml();
            System.out.println("Replace product successful");
        } else {
            System.out.println("You dont have product with this id");
        }
    }

    List<Product> priceSortList() {
        return readFromXml().getProductsList().stream()
                .sorted((product1, product2) -> product2.getPrice() - product1.getPrice())
                .collect(Collectors.toList());
    }


    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = readFromXml().getProductsList().size(); i > 0; i--) {
            sortByLastAddToList.add(readFromXml().getProductsList().get(i - 1));
        }
        return sortByLastAddToList;
    }

    public void printFirstMenu() {
        System.out.println("1. Вывод всех товаров");
        System.out.println("2. Добавление товара");
        System.out.println("3. Удаление товара");
        System.out.println("4. Редактирование товара");
        System.out.println("5. Удалить все товары");
        System.out.println("6. Выход");
    }

    public void printSecondMenu() {
        System.out.println("1. По цене(возрастание)");
        System.out.println("2. По цене(убывание)");
        System.out.println("3. По добавлению(сначала новые, потом более старые)");
    }


    public void start() {
        Scanner sc = new Scanner(System.in);
        try {
            String key;
            do {
                printFirstMenu();
                System.out.print("Введите номер меню: ");
                key = sc.nextLine().trim();
                System.out.print("Текущая дата и время : ");
                printNowDate();
                switch (key) {
                    case "1":
                        printSecondMenu();
                        System.out.print("Введите номер меню: ");
                        key = sc.nextLine().trim();
                        switch (key) {
                            case "1":
                                products = readFromXml().getProductsList();
                                for (int i = products.size(); i > 0; i--) {
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
                        System.out.print("Вы уверены? Введите 9 если уверены: ");
                        key = sc.nextLine().trim();
                        switch (key) {
                            case "9":
                                new File(FILEPATH).delete();
                                products.clear();
                                break;
                            default:
                                System.out.println("Вы ввели неверное значение меню.\n");
                        }
                    case "6":
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню.\n");
                }
            } while (!key.equals("6"));
            System.out.println("Завершение программы. Все данные сохранены.");
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверное значение. Необходимо ввести цифу\n");
            start();
        } catch (NullPointerException e) {
            start();
        }
    }
}


