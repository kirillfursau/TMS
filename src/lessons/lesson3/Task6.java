public class Task6 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        for (int num3 = 2; num3 < 1000; num3 = num1 + num2){
            num2 = num1;
            num1 = num3;
            System.out.println(num3);
        }
    }
}
