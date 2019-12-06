package homeWork.homeWork5;

public class Main {
    public static void main(String[] args) {
        PassengerCar pc1 = new PassengerCar(115,140,2300,"volvo",4,12,
                "minivan",8);
        Truck tr1 = new Truck(210,120,3700, "BMW",8,23,15);
        CivilAir ca1 = new CivilAir(600,700,23000,"Airbus",32,1500,110,true);
        WarAir wa1 = new WarAir(900,890,21000,"Killer",26,900,false,7);
        System.out.println(pc1.getInformation());
        System.out.println(tr1.getInformation());
        System.out.println(ca1.getInformation());
        System.out.println(wa1.getInformation());
        pc1.kiloPerFuel(2);
    }
}
