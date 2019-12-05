package homeWork.homeWork5;

public class Main {
    public static void main(String[] args) {
        PassengerCar pc1 = new PassengerCar(21,2,2,21,4,23,car,4);
        Truck tr1 = new Truck(25,2,24, 21,8,4,1);
        CivilAir ca1 = new CivilAir(150,700,150,1,10,100,15,1);
        WarAir wa1 = new WarAir(121,231,123,volvo,312,132,31,3);
        pc1.getInformation();
        tr1.getInformation();
        ca1.getInformation();
        wa1.getInformation();
    }
}
