package homeWork.homeWork3;

import java.util.Scanner;

public class Exe1_Expectation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int length = sc.nextInt();
        int[] array;
        if (length <= 10) {
            array = new int[length];
            for (int i = 0; i < length; i++) {
                array[i] = 2 + (int) (Math.random() * 19);
                if (array[i] % 2 == 0) {
                    System.out.println(array[i]);
                } else {
                    i--;
                }
            }
        } else {
            System.out.println("Enter a number from 1 to 10 ");
        }
    }
}