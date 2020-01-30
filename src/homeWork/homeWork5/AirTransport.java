package homeWork.homeWork5;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AirTransport extends Transport {
    private int wingspan;
    private int minimumRunway;

    AirTransport() {

    }

    AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway) {
        super(power, maxSpeed, weight, brand);
        setWingspan(wingspan);
        setMinimumRunway(minimumRunway);
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunway() {
        return minimumRunway;
    }

    public void setMinimumRunway(int minimumRunway) {
        this.minimumRunway = minimumRunway;
    }
}
