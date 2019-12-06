package homeWork.homeWork5;

public class CivilAir extends AirTransport {
    int totalPassengers;
    boolean bissnes;

    CivilAir(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway, int totalPassengers, boolean bissnes) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalPassengers = totalPassengers;
        this.bissnes = bissnes;
    }

    String getInformation() {
        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + ". Weight(Kg) : " + weight + ". Brand : " + brand
                + ". Wingspan(M) : " + wingspan + ". Minimum distance to fly away(M) : " + minimumRunway + ". Total passengers : " + totalPassengers + ". Bissnes class : " +
                bissnes + ". Power in kilowat : " + powerKW();
    }

    void maxPassengers(int passengers) {
        if (passengers < totalPassengers) {
            System.out.println("Plane loaded");
        } else {
            System.out.println("You need a bigger plane");
        }
    }
}
