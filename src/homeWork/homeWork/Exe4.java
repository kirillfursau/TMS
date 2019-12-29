package homeWork.homeWork;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое число:");
        int a = sc.nextInt();
        System.out.print("Введите еще одно любое число:");
        int b = sc.nextInt();
        System.out.print("И последний раз");
        int c = sc.nextInt();
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("БУММММ!!!");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("Вы ввели три положительных числа");
        } else if ((a > 0 && b > 0) || (b > 0 && c > 0) || (c > 0 && a > 0)) {
            System.out.println("Вы ввели два положительных числа");
        } else if (a > 0 || b > 0 || c > 0) {
            System.out.println("Вы ввели одно положительное число");
        } else {
            System.out.println("Нет положительных чисел");
        }
        sc.close();
    }
}
