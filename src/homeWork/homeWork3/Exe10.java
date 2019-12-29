package homeWork.homeWork3;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 3 : ");
        int n = sc.nextInt();
        int[] firstArray = new int[n];
        int countEven = 0;
        if (n < 3) {
            System.out.println("Enter another number");
        } else {
            for (int i = 0; i < n; i++) {
                firstArray[i] = (int) (Math.random() * n);
                System.out.print(" " + firstArray[i]);
                if (firstArray[i] % 2 == 0 && firstArray[i] != 0) {
                    countEven++;
                }
            }
            System.out.println();
            if (countEven > 0) {
                System.out.println(countEven);
                int[] secondArray = new int[countEven];
                int j = 0;
                for (int i = 0; i < n; i++) {
                    if (firstArray[i] % 2 == 0 && firstArray[i] != 0) {
                        secondArray[j] = firstArray[i];
                        System.out.print(" " + secondArray[j]);
                        j++;
                    }
                }
            } else {
                System.out.println("No even numbers inside");
            }
        }
    }
}
