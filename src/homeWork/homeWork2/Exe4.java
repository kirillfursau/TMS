package homeWork.homeWork2;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Составьте программу, вычисляющую A*B, не пользуясь операцией
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Write first number : ");
        int firstNumber = sc.nextInt();
        System.out.print("Write second number : ");
        int secondNumber = sc.nextInt();
        int multNumbs = 0;
        for (int a = 0; a < firstNumber; a++) {
            multNumbs = multNumbs + secondNumber;
        }
        System.out.println("Multiplication of numbers is " + multNumbs);
    }
}
