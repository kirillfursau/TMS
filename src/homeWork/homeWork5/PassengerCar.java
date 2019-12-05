package homeWork.homeWork5;

import java.util.Scanner;

public class PassengerCar extends GroundTransport {
    String bodyTipe;
    int totalPassengers;

    PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyTipe, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyTipe = bodyTipe;
        this.totalPassengers = totalPassengers;
    }

    String getInformation() {
        return power + maxSpeed + weight + brand + numberOfWheels + fuelConsumption + bodyTipe + fuelConsumption + powerKW;
    }

    private void fuelConsumptionDistance() {
       int fuelConsumptionDistance =  fuelConsumption;
    }

    void kiloPerFuel(int time) {
        int distance = time * maxSpeed;
        System.out.println("Distance on max speed is : " + distance + "for " + time + " hours");
        System.out.println("Fuel consumption on max speed " + fuelConsumptionDistance + "for" + time + " hours");
    }
}
