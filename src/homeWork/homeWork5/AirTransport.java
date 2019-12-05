package homeWork.homeWork5;


public class AirTransport extends Transport {
    int wingspan;
    int minimumRunway;

    AirTransport(int power, int maxSpeed, int weight, String brand,  int wingspan, int minimumRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }
}
