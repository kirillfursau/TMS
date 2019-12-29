package homeWork.homeWork;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = sc.nextInt();
        if (x > 0 && x < 10) {
            System.out.println("Это однозначное положительное число");
        } else if (x >= 10 && x < 100) {
            System.out.println("Это двузначное положительное число");
        } else if (x >= 100 && x <= 999) {
            System.out.println("Это трехзначное положительное число");
        } else if (x >= 1000) {
            System.out.println("С этим я еще не работаю");
        } else if (x < 0 && x > -10) {
            System.out.println("Это однозначное отрицательное число");
        } else if (x <= -10 && x > -100) {
            System.out.println("Это двузначное отрицательное число");
        } else if (x <= -100 && x >= -999) {
            System.out.println("Это трехзначное отрицательное число");
        } else if (x <= -1000) {
            System.out.println("С этим я еще не работаю");
        } else if (x == 0) {
            System.out.println("В интернете сказано, что однозначное число");
        }
        sc.close();
    }
}