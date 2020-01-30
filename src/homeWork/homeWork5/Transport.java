package homeWork.homeWork5;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport() {
    }

    Transport(int power, int maxSpeed, int weight, String brand) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setBrand(brand);
    }

    double powerKW() {
        double powerKW = power * 0.74;
        return powerKW;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

