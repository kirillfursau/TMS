package homeWork.homeWork5;

public class Main {
    public static void main(String[] args) {
        PassengerCar pc1 = new PassengerCar(115, 140, 2300, "volvo", 4,
                12,
                "minivan", 8);
        Truck tr1 = new Truck(210, 120, 3700, "BMW", 8,
                23, 15);
        CivilAirTransport ca1 = new CivilAirTransport(600, 700, 23000, "Airbus",
                32, 1500, 110, true);
        WarAirTransport wa1 = new WarAirTransport(900, 890, 21000, "Killer",
                26, 900, false, 7);
        System.out.println(pc1.getInformation());
        System.out.println(tr1.getInformation());
        System.out.println(ca1.getInformation());
        System.out.println(wa1.getInformation());
        pc1.kiloPerFuel(2);
        tr1.maxCarrying(6);
        ca1.maxPassengers(115);
        wa1.shot();
        wa1.bailout();
        /*
        Если при реализации Xml поле обозначено как Public пусть даже у него есть геттеры и сеттеры и пустой конструктор
        будет вылетать и исключение IllegalAnnotationsException
         */
    }
}
