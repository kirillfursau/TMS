package homeWork.homeWork3;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        boolean badNumber = true;
        while (badNumber) {
            System.out.print("Enter length of array : ");
            length = sc.nextInt();
            if (length > 0 && length % 2 == 0) {
                badNumber = false;
            } else {
                System.out.println("Invalid number. Try it again");
            }
        }
        int[] array = new int[length];
        int leftHalfSum = 0;
        int rightHalfSum = 0;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 16);
            System.out.print(" " + array[i]);
            if (i < length / 2) {
                leftHalfSum += array[i];
            } else {
                rightHalfSum += array[i];
            }
        }
        System.out.println();
        if (leftHalfSum > rightHalfSum) {
            System.out.println("The left half sum is greater");
        } else if (leftHalfSum < rightHalfSum) {
            System.out.println("The right half sum is greater");
        } else {
            System.out.println("The sum of the sides is the same");
        }
    }
}
