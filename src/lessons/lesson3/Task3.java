package lessons.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        while (num3 < 1000){
            num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
            System.out.println(num3);
        }
    }
}
