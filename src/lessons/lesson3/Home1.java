package lessons.lesson3;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Put length of array :");
        int length = sc.nextInt();
        int[] array;
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = 2 + (int) (Math.random() * 19);
            if (array[i] % 2 == 0){
            System.out.println(array[i]);
        }else {
               i--;
            }
        }
    }
}