package homeWork.homeWork5;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class GroundTransport extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    public GroundTransport() {
    }

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        setNumberOfWheels(numberOfWheels);
        setFuelConsumption(fuelConsumption);
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}



