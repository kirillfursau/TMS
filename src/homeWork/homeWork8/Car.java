package homeWork.homeWork8;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Car {
    /*
    Создать собственное исключение
    - Создать класс Car c полями (марка, скорость, цена), конструкторы
    (с параметрами и default) гетеры-сетеры.
    Создать метод старт в котором пытаетесь завести автомобиль.
    В методе старт генерируете случайное число от 0 до 20, если полученное
    число оказалось четным, то выбрасываете созданное ранее вами исключение
    и передаете его к месту откуда вызывали метод старт. Если все хорошо и
    исключение не вылетело, то выводить в консоль сообщение что автомобиль
    с такой-то маркой завелся.
    */
    private String brand;
    private int speed;
    private int price;

    Car(String brand, int speed, int price) {
        setBrand(brand);
        setSpeed(speed);
        setPrice(price);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(
                    ("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork8/" + brand + speed+ "Car.json")),this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Car() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    void tryToStartCar() {
        int randomNumber = (int) (Math.random() * 21);
        if (randomNumber % 2 == 0) {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("Cant stat car " + getBrand());
            }
        } else {
            System.out.println("Car " + getBrand() + " was started");
        }
    }
}

