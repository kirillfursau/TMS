package homeWork.homeWork3;

public class Exe7 {
    public static void main(String[] args) {
        int length = 12;
        int[] array;
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 16);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int maxNumber = array[0];
        int lastInputIndex = 0;
        for (int i = 1; i < length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
                lastInputIndex = i;
            }
        }
        System.out.println("Max number is " + maxNumber);
        System.out.println("Last input index is " + lastInputIndex);
    }
}