package homeWork.homeWork2;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Вычислить: 1+2+4+8+...+256
        */
        int sum = 0;
        for (int firstNumber = 1; firstNumber <= 256; firstNumber *= 2) {
            sum = firstNumber + sum;
        }
        System.out.println(sum);
    }
}
