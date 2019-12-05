package homeWork.homeWork5;


public class Transport {
    int power;
    int maxSpeed;
    int weight;
    String brand;
    double powerKW = power * 0.74;

    Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    void powerKW (){
       double powerKW = power * 0.74;
    }
}
