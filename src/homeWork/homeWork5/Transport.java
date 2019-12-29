package homeWork.homeWork5;


public class Transport {
    int power;
    int maxSpeed;
    int weight;
    String brand;


    Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    double powerKW() {
        double powerKW = power * 0.74;
        return powerKW;
    }
}
