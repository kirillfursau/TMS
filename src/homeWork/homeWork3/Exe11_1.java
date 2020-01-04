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
        } else {
            System.out.println("Multiplication of elements multiples of three: " + multThree);
        }
        int sumOdd = 0;
        int howManyOddNumbers = 0;
        for (int i = 0; i < length; i++) { // find average arithmetic of the of odd elements
            if (i % 2 == 1) {
                sumOdd += array[i];
                howManyOddNumbers++;
            }
        }
        System.out.println("The average arithmetic of the of odd elements : " + ((double) (sumOdd) / howManyOddNumbers));
        System.out.print("Less than what number need to skip : ");
        int moreThanNumber = sc.nextInt();
        int sumNoSkip = 0;
        int noSkipNumbers = 0;
        for (int i = 0; i < length; i++) { //find average arithmetic of the some number
            if (array[i] > moreThanNumber) {
                sumNoSkip += array[i];
                noSkipNumbers++;
            }
        }
        System.out.println("The average arithmetic of the remaining elements : "
                + (double)(sumNoSkip) / noSkipNumbers);
        int theLeastElement = array[1];
        for (int i = 1; i < length - 2; i += 2) { // find the least odd element of the array is
            if (array[i] > array[i + 2]) {
                theLeastElement = array[i + 2];
            }
        }
        System.out.println("The least odd element of the array is : " + theLeastElement);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(" " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0; // replace every second number zero
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}