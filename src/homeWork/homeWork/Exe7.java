package homeWork.homeWork;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число програмистов:");
        int a = sc.nextInt();
        int b = a % 10;
        int j = a % 100;
        if (a > 0) {
            if (j >= 11 && j <= 14) {
                System.out.println(a + " Программистов");
                return;
            }
            switch (b) {
                case 1:
                    System.out.println(a + " Программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(a + " Программиста");
                    break;
                default:
                    System.out.println(a + " Программистов");
            }
        } else {
            System.out.println("Число должно быть положительным!");
        }
        sc.close();
    }
}