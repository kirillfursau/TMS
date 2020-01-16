package homeWork.homeWork2;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        */
        int amountAmeb = 1;
        for (int hours = 0; hours <= 24; hours = hours + 3) {
            if (hours == 0) {
                System.out.println("For the first we have " + amountAmeb + " ameb");
            } else if (hours != 24) {
                amountAmeb *= 2;
                System.out.println("After " + hours + " hours amount of amebas are " + amountAmeb);
            } else {
                amountAmeb *= 2;
                System.out.println("In the end after " + hours + " hours we have " + amountAmeb + " amebas");
            }
        }
    }
}