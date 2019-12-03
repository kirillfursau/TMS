package homeWork.homeWork;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Раз число пложительное прибавим единицу = " + (x + 1));
        } else if (x < 0) {
            System.out.println("Так как число отрицательное сделаем его меньше на 2 = " + (x - 2));
        } else if (x == 0) {
            System.out.println("Ну если это ноль то присвоим ему следующие значение " + (x = 10));
        }
        sc.close();
    }
}
