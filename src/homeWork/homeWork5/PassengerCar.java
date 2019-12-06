package homeWork.homeWork5;


public class PassengerCar extends GroundTransport {
    String bodyTipe;
    int totalPassengers;

    PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyTipe, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyTipe = bodyTipe;
        this.totalPassengers = totalPassengers;
    }

    private double fuelConsumptionDistance(double distance) {
        double fuelConsumptionDistance = fuelConsumption * (distance/100);
        return fuelConsumptionDistance;
    }

    String getInformation() {

        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + ". Weight(Kg) : " + weight + ". Brand : " + brand
                + ". Number of Wheels : " + numberOfWheels + ". Fuel consumption(L/100km) : " + fuelConsumption + ". Tipe of body : " + bodyTipe
                + ". Power in kilowat : " + powerKW();
    }


    void kiloPerFuel(int time) {
        int distance = time * maxSpeed;
        System.out.println("For the time " + time + "h car " + brand  + " moving at maximum speed " + maxSpeed + " km and use up "
         + fuelConsumptionDistance(distance) + " liters of fuel.");
    }
}
