package homeWork.homeWork2;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Напишите программу печати таблицы перевода расстояний из дюймов в
        */
        for (double distCent = 1; distCent <= 20; distCent++) {
            double distInch = distCent * 2.54;
            System.out.println("Distanstion in Centimeter " + distCent + " = Distantsion in Inch " + distInch);

        }
    }
}
