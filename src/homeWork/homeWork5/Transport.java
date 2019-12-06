package homeWork.homeWork5;


public class Transport {
    int power;
    int maxSpeed;
    int weight;
    String brand;
    double powerKW;

    Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    double powerKW() {
        powerKW = power * 0.74;
        return powerKW;
    }
}
