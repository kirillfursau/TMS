package homeWork.homeWork2;

public class Exe1 {
    public static void main(String[] args) {
        double firstDayDistance = 10;
        double allDistance = 0;
        for (int day = 0; day < 7; day++) {
            allDistance = firstDayDistance + allDistance;
            firstDayDistance = firstDayDistance * 1.1;
        }
        System.out.println("All distance for 1 week is " + allDistance);
    }
}
