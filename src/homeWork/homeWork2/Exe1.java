package homeWork.homeWork2;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?
        */
        double firstDayDistance = 10;
        double allDistance = 0;
        for (int day = 0; day < 7; day++) {
            allDistance = firstDayDistance + allDistance;
            firstDayDistance = firstDayDistance * 1.1;
        }
        System.out.println("All distance for 1 week is " + allDistance);
    }
}
