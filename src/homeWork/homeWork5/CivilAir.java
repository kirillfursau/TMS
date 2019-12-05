package homeWork.homeWork5;

public class CivilAir extends AirTransport {
    int totalPassengers;
    boolean bissnes;
    CivilAir(int power, int maxSpeed, int weight, String brand,  int wingspan, int minimumRunway, int totalPassengers, boolean bissnes){
        super(power, maxSpeed, weight, brand,   wingspan, minimumRunway);
        this.totalPassengers = totalPassengers;
        this.bissnes = bissnes;
    }
    String getInformation(){
        return power + maxSpeed + weight + brand  +  wingspan + minimumRunway+ powerKW;
    }
}
