package homeWork.homeWork5;

import java.util.Scanner;

public class PassengerCar extends GroundTransport {
    public String bodyTipe;
    public int totalPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyTipe, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyTipe = bodyTipe;
        this.totalPassengers = totalPassengers;
    }

}
