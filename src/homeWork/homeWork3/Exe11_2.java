package homeWork.homeWork3;

import java.util.Scanner;

public class Exe11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int length = sc.nextInt();
        int[] array = new int[length];
        boolean equal = false;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(" " + array[i]);
        }
        for (int i = 0; i < length; i++) { //Проверить, различны ли все элементы массива.
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    equal = true;
                    break;
                }
            }
        }
        System.out.println();
        if (equal) {
            System.out.println("Some Array elements are equal");
        } else {
            System.out.println("Array elements are not equal");
        }
        System.out.print("Enter number need to find : "); // Подсчитать, сколько раз встречается элемент
        int findNumber = sc.nextInt();                    // с заданным значением.
        int timesFindNumber = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == findNumber) {
                timesFindNumber++;
            }
        }
        System.out.println("Find your number " + timesFindNumber + " times");
        int maxArray = 0;
        for (int i = 0; i < length; i++) {
            if (maxArray < array[i]) {
                maxArray = array[i];
            }
        }
        if (length <= 1) {
            System.out.println("No second element");//Найти второй по величине (
        } else {                                    //т.е. следующий по величине за максимальным) элемент в массиве.
            int secondMaxArray = 0;
            for (int i = 0; i < length; i++) {
                if (secondMaxArray < array[i] && array[i] != maxArray) {
                    secondMaxArray = array[i];
                }
            }
            System.out.println("The second max number in array is " + secondMaxArray);
        }
        if (length <= 2) {
            System.out.println("No even element");
        } else {
            int lessEvenElement = array[2];
            for (int i = 0; i < length - 2; i += 2) {  // find less even element of the array
                if (array[i] > array[i + 2]) {
                    lessEvenElement = array[i + 2];
                }
            }
            System.out.println("The less even element is " + lessEvenElement); //
            int zeroArray = array[0];         // Найти наименьший элемент среди элементов с четными индексами массива
            for (int i = 1; i < length; i++) {
                if (array[i] == maxArray) {
                    array[0] = maxArray;
                    array[i] = zeroArray;
                }
            }
            System.out.println("Array when we swap max array number with zero array number");
            for (int i = 0; i < length; i++) {    // Найти максимальный элемент в массиве
                System.out.print(" " + array[i]); // и поменять его местами с нулевым элементом
            }
        }
    }
}
