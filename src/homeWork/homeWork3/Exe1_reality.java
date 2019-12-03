package homeWork.homeWork3;

public class Exe1_reality {
    public static void main(String[] args) {
        int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i * 2 + 2;
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
