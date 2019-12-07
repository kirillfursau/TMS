package homeWork.homeWork5;

public class WarAirTransport extends AirTransport {
    boolean bailoutSystem;
    int totalRockets;

    WarAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway,
                    boolean bailoutSystem, int totalRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalRockets = totalRockets;
        this.bailoutSystem = bailoutSystem;
    }

    String getInformation() {
        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + "/ Weight(Kg) : " + weight +
                ". Brand : " + brand
                + ". Wingspan(M) : " + wingspan + " Minimum distance to fly away(M) : " + minimumRunway +
                ". Total rockets : " + totalRockets + ". Bailout system : " +
                bailoutSystem + ". Power in kilowat : " + powerKW();
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
