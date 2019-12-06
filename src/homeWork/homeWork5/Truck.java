package homeWork.homeWork5;

public class Truck extends GroundTransport {
    int carrying;

    Truck(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }

    String getInformation() {
        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + ". Weight(Kg) : " + weight + ". Brand : " + brand
                + ". Number of Wheels : " + numberOfWheels + ". Fuel consumption(L/100km) : " + fuelConsumption +
                ". Carrying capacity(T) : " + carrying
                + ". Power in kilowat : " + powerKW();
    }

    void maxCarrying(int cargoWeight) {
        if (cargoWeight < carrying) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }
}
