package lessons.lesson4;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Put length of array :");
        int length = sc.nextInt();
        int[] array;
        int sort;
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[i] > array[j]) {
                    sort = array[i];
                    array[i] = array[j];
                    array[j] = sort;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}