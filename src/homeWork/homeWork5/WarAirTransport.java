package homeWork.homeWork5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

@XmlRootElement
public class WarAirTransport extends AirTransport {
    private boolean bailoutSystem;
    private int totalRockets;

    public WarAirTransport() {

    }

    WarAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway,
                    boolean bailoutSystem, int totalRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalRockets = totalRockets;
        this.bailoutSystem = bailoutSystem;
        try {
            File file = new File("/Users/kirylfursau/Desktop/TMS/src/homeWork/homeWork5/"
                    + power + brand + "WarAirTransport.xml");
            JAXBContext context = JAXBContext.newInstance(WarAirTransport.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String getInformation() {
        return "Power in horses : " + getPower() + ". Max speed km/h : " + getMaxSpeed() + "/ Weight(Kg) : " +
                getWeight() + ". Brand : " + getBrand() + ". Wingspan(M) : " + getWingspan() +
                " Minimum distance to fly away(M) : " + getMinimumRunway() + ". Total rockets : " + totalRockets +
                ". Bailout system : " + bailoutSystem + ". Power in kilowat : " + powerKW();
    }

    void shot() {
        int shots = totalRockets;
        for (int i = 0; i <= shots; i++) {
            if (totalRockets > 0) {
                System.out.println("Rocket launch");
                totalRockets--;
            } else {
                System.out.println("No ammo");
            }
        }
    }

    void bailout() {
        if (bailoutSystem) {
            System.out.println("Bailout was successful");
        } else {
            System.out.println("No bailout system");
        }
    }
}
