public class Task5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 188880; a != 0; a /= 10) {
            sum += a % 10;

        }
        System.out.println(sum);
    }
}

