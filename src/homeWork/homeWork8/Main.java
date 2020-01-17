package homeWork.homeWork8;


public class Main {
    public static void main(String[] args) {
        /*
        В main создаете парочку автомобилей и пытаетесь их завести.
        И обрабатываете исключение которое может вылететь при старте автомобиля
        */
        Car car = new Car("Volvo", 120, 12000);
        Car car1 = new Car("Opel", 110, 10000);
        Car car2 = new Car("Nissan", 100, 8000);
        car.tryToStartCar();
        car1.tryToStartCar();
        car2.tryToStartCar();
    }
}
