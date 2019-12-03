package homeWork.homeWork3;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int length = sc.nextInt();
        int[] array = new int[length];
        int leftHalfSum = 0;
        int rightHalfSum = 0;
        if (length % 2 == 1) {
            System.out.println("Input another length of array");
        } else {
            for (int i = 0; i < length; i++) {
                array[i] = (int) (Math.random() * 15);
                System.out.print(" " + array[i]);
            }
            System.out.println();
            for (int i = 0; i < length / 2 - 1; i++) {
                leftHalfSum = leftHalfSum + array[i];
            }
            for (int i = length / 2; i < length; i++) {
                rightHalfSum = rightHalfSum + array[i];
            }
            if (leftHalfSum > rightHalfSum) {
                System.out.println("The left half sum is greater");
            } else if (leftHalfSum < rightHalfSum) {
                System.out.println("The right half sum is greater");
            } else {
                System.out.println("The sum of the sides is the same");
            }
        }
    }
}