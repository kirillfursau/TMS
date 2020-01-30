package homeWork.homeWork5;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

@XmlRootElement
public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int totalPassengers;

    public PassengerCar() {
    }

    PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption,
                 String bodyType, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        setBodyType(bodyType);
        setTotalPassengers(totalPassengers);
        try {
            File file = new File("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork5/"
                    + power + brand + "PassengerCar.xml");
            JAXBContext context = JAXBContext.newInstance(PassengerCar.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double fuelConsumptionDistance(double distance) {
        double fuelConsumptionDistance = getFuelConsumption() * (distance / 100);
        return fuelConsumptionDistance;
    }

    String getInformation() {

        return "Power in horses : " + getPower() + ". Max speed km/h : " + getMaxSpeed() + ". Weight(Kg) : " +
                getWeight()+ ". Brand : " + getBrand() + ". Number of Wheels : " + getNumberOfWheels() +
                ". Fuel consumption(L/100km) : " + getFuelConsumption() + ". Type of body : " + bodyType +
                " Total passengers : " + totalPassengers + ". Power in kilowat : " + powerKW();
    }


    void kiloPerFuel(double time) {
        double distance = time * getMaxSpeed();
        System.out.println("For the time " + time + "h car " + getBrand() + " moving at maximum speed " + getMaxSpeed()+
                " it will drive " + distance + " km and use up " +
                +fuelConsumptionDistance(distance) + " liters of fuel.");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }
}
