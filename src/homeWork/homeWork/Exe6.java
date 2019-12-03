package homeWork.homeWork;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a :");
        int a = sc.nextInt();
        System.out.print("Введите число b :");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Большее число a = " + a);
        } else {
            System.out.println("Большее число b = " + b);
        }
        sc.close();
    }
}