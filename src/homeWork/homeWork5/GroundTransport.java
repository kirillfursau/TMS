package homeWork.homeWork5;


public class GroundTransport extends Transport {
    public int numberOfWheels;
    public int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;

    }
}



