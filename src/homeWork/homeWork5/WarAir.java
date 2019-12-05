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
        return power + maxSpeed + weight + brand + wingspan + minimumRunway + totalRockets + bailoutSystem+ powerKW;
    }
}
