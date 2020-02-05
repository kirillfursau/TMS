package lessons.lesson3;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input three height: ");
        int diaposon = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i <= diaposon; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(" " + i);
            }else{
                prime = true;
            }
        }
    }
}
