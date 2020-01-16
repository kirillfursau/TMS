package homeWork.homeWork2;

public class Exe7 {
    public static void main(String[] args) {
        /*
        Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
        */
        int sum = 0;
        for (int i = 1; i <= 99; i += 2) {
            sum += i;
        }
        System.out.println("sum of odd numbers" + sum);
    }
}

