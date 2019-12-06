package homeWork.homeWork5;

public class WarAir extends AirTransport {
    boolean bailoutSystem;
    int totalRockets;
    WarAir(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway, boolean bailoutSystem, int totalRockets){
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalRockets = totalRockets;
        this.bailoutSystem = bailoutSystem;
    }
    String getInformation(){
        return "Power in horses : " + power + ". Max speed km/h : " + maxSpeed + "/ Weight(Kg) : " + weight + ". Brand : " + brand
                + ". Wingspan(M) : " + wingspan + " Minimum distance to fly away(M) : " + minimumRunway + ". Total rockets : " + totalRockets + ". Bailout system : " +
                bailoutSystem + ". Power in kilowat : " + powerKW();
    }
}
