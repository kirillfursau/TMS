package homeWork.homeWork5;

public class Truck extends GroundTransport {
    int carrying;
    Truck(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int carrying){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }
    String getInformation(){
        return power +  maxSpeed +  weight +  brand + numberOfWheels + fuelConsumption + carrying + powerKW;
    }
}
