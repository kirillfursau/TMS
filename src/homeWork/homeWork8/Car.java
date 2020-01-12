package homeWork.homeWork8;

public class Car {
    private String brand;
    private int speed;
    private int price;

    Car(String brand, int speed, int price) {
        setBrand(brand);
        setSpeed(speed);
        setPrice(price);
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
            } catch (Exception e) {
            }
        } else {
            System.out.println("Car " + getBrand() + " was started");
        }
    }
}

