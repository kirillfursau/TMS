package homeWork.homeWork5;


public class PassengerCar extends GroundTransport {
    String bodyType;
    int totalPassengers;

    PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption,
                 String bodyType, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.totalPassengers = totalPassengers;
    }

    private double fuelConsumptionDistance(double distance) {
        double fuelConsumptionDistance = fuelConsumption * (distance / 100);
        return fuelConsumptionDistance;
    }

    String getInformation() {

        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + ". Weight(Kg) : " + weight +
                ". Brand : " + brand + ". Number of Wheels : " + numberOfWheels + ". Fuel consumption(L/100km) : "
                + fuelConsumption + ". Type of body : " + bodyType + " Total passengers : " + totalPassengers +
                ". Power in kilowat : " + powerKW();
    }


    void kiloPerFuel(double time) {
        double distance = time * maxSpeed;
        System.out.println("For the time " + time + "h car " + brand + " moving at maximum speed " + maxSpeed +
                " it will drive " + distance + " km and use up " +
                +fuelConsumptionDistance(distance) + " liters of fuel.");
    }
}
