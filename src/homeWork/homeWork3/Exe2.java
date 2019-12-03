package homeWork.homeWork3;

public class Exe2 {
    public static void main(String[] args) {
        int arrayLength = 0;
        for (int i = 0; i < 99; i += 2) {
            arrayLength++;
        }
        System.out.println(arrayLength);
        int[] array;
        array = new int[arrayLength];
        for (int j = 0; j < arrayLength; j++) {
            array[j] = j * 2 + 1;
            System.out.print(" " + array[j]);
        }
        System.out.println();
        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
    }
}
