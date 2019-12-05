package homeWork.homeWork4;

public class Main {
    public static void main(String[] args) {
        Сompucter cp1 = new Сompucter();
        cp1.printCompInformation();
        boolean fire = false;
        while (true) {
            cp1.turnOn();
            cp1.turnOff();
        }
    }
}