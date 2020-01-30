package homeWork.homeWork5;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

@XmlRootElement
public class CivilAirTransport extends AirTransport {
    private int totalPassengers;
    private boolean bissnes;

    CivilAirTransport() {

    }

    CivilAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway,
                      int totalPassengers, boolean bissnes) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        setTotalPassengers(totalPassengers);
        setBissnes(bissnes);
        try {
            File file = new File("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork5/"
                    + power + brand + "CivilAirTransport.xml");
            JAXBContext context = JAXBContext.newInstance(CivilAirTransport.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String getInformation() {
        return "Power in horses : " + getPower() + ". Max speed km/h : " + getMaxSpeed() + ". Weight(Kg) : " +
                getWeight() + ". Brand : " + getBrand() + ". Wingspan(M) : " + getWingspan() +
                ". Minimum distance to fly away(M) : " + getMinimumRunway() + ". Total passengers : " +
                totalPassengers + ". Bissnes class : " + bissnes + ". Power in kilowat : " + powerKW();
    }

    void maxPassengers(int passengers) {
        if (passengers < totalPassengers) {
            System.out.println("Plane loaded");
        } else {
            System.out.println("You need a bigger plane");
        }
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

    public boolean isBissnes() {
        return bissnes;
    }

    public void setBissnes(boolean bissnes) {
        this.bissnes = bissnes;
    }
}
