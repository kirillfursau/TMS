package lessons.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int a = 185555;
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}

