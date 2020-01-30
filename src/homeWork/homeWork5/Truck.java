package homeWork.homeWork5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.File;

@XmlRootElement
public class Truck extends GroundTransport {
    private int carrying;

    public Truck() {
    }

    Truck(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        setCarrying(carrying);
        try {
            File file = new File("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork5/"
                    + power + brand + "Truck.xml");
            JAXBContext context = JAXBContext.newInstance(Truck.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String getInformation() {
        return "Power in horses : " + getPower() + ". Max speed km/h : " + getMaxSpeed() + ". Weight(Kg) : " +
                getWeight() + ". Brand : " + getBrand() + ". Number of Wheels : " + getNumberOfWheels() +
                ". Fuel consumption(L/100km) : " + getFuelConsumption() + ". Carrying capacity(T) : " + carrying +
                ". Power in kilowat : " + powerKW();
    }

    void maxCarrying(int cargoWeight) {
        if (cargoWeight < carrying) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }

    @XmlTransient
    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
