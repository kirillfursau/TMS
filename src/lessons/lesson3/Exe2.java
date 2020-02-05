package lessons.lesson3;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input three height: ");
        int height = sc.nextInt();
        int width = height * 2 - 1;
        String [][] array;
        array = new String [height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                array[i][j]= " ";
                System.out.print(array[i][j]);
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                array[i][k] = "*";
                System.out.print(array[i][k]);
            }
            System.out.println();
        }
        for (int j = 0; j <= width / 2; j++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int j = 0; j <= width / 2 - 1; j++) {
            System.out.print(" ");
        }
        System.out.print("***");
    }
}




