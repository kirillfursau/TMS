package homeWork.homeWork9;

import java.io.*;

public class Car implements Serializable {
    String brand;
    int speed;
    int price;

    Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public static void main(String[] args) {
        try (ObjectOutputStream obg = new ObjectOutputStream(new FileOutputStream("Car.txt"))) {
            Car car = new Car("Volvo", 110, 21);
            obg.writeObject(car);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream obn = new ObjectInputStream(new FileInputStream("Car.txt"))) {
            Car car1 = (Car) obn.readObject();
            System.out.println(car1.brand + " " + car1.speed + " " + car1.price);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
