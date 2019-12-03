package homeWork.homeWork3;

import java.util.Scanner;

public class Exe11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int multThree = 1;
        for (int i = 0; i < length; i++) { // find elements multiple three
            if (array[i] % 3 == 0) {
                multThree = array[i] * multThree;
            }
        }
        if (multThree == 1) {
            System.out.println("No elements multiples of three");
            multThree = 0;
        } else {
            System.out.println("Multiplication of elements multiples of three: " + multThree);
        }
        int sumOdd = 0;
        int howMuchOddNumbers = 0;
        for (int i = 0; i < length; i++) { // find average arithmetic of the of odd elements
            if (i % 2 == 1) {
                sumOdd += array[i];
                howMuchOddNumbers++;
            }
        }
        System.out.println("The average arithmetic of the of odd elements : " + (sumOdd / howMuchOddNumbers));
        System.out.print("How many array elements to skip : ");
        int skipElemnts = sc.nextInt();
        int sumNoSkip = 0;
        for (int i = skipElemnts; i < length; i++) { //find average arithmetic of the remaining elements
            sumNoSkip += array[i];
        }
        System.out.println("The average arithmetic of the remaining elements : "
                + (sumNoSkip / (length - skipElemnts)));
        int lessElement = array[1];
        for (int i = 1; i < length - 2; i += 2) { // find less odd element of the array is
            if (array[i] > array[i + 2]) {
                lessElement = array[i + 2];
            }
        }
        System.out.println("The less odd element of the array is : " + lessElement);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(" " + array[i]);
        }
    }
}