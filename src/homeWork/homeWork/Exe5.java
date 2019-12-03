package homeWork.homeWork;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое число:");
        int a = sc.nextInt();
        System.out.print("Введите еще одно любое число:");
        int b = sc.nextInt();
        System.out.print("И последний раз:");
        int c = sc.nextInt();
        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;
        if (a > 0) {
            countPositive++;
        } else if (a < 0) {
            countNegative++;
        } else {
            countNull++;
        }
        if (b > 0) {
            countPositive++;
        } else if (b < 0) {
            countNegative++;
        } else {
            countNull++;
        }
        if (c > 0) {
            countPositive++;
        } else if (c < 0) {
            countNegative++;
        } else {
            countNull++;
        }
        System.out.print("Положительных чисел " + countPositive + " " + "\nОтрицательных чисел " + countNegative);
        if (countNull > 0) {
            System.out.println("\nНули тут тоже были и их " + countNull);
        }
        sc.close();
    }
}