package homeWork.homeWork;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону а:");
        int a = sc.nextInt();
        System.out.print("Введите сторону b:");
        int b = sc.nextInt();
        System.out.print("Введите сторону с:");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }
        sc.close();
    }
}