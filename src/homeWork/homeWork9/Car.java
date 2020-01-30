package homeWork.homeWork9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Car implements Serializable {
    /*
    Сеарилизовать объект Автомобиль(Марка, скорость, цена).
    После сериализации произвести обратный процесс.
    */
    String brand;
    int speed;
    int price;

    public Car() {
    }

    Car(String brand, int speed, int price) {
        setBrand(brand);
        setSpeed(speed);
        setPrice(price);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(
                    ("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork9/" + brand + speed+ "Car.json")),this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
