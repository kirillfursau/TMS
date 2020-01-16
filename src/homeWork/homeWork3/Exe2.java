package homeWork.homeWork3;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Создайте массив из всех нечётных чисел от 1 до 99, выведите
        его на экран в строку, а затем этот же массив выведите на
        экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
        */
        int arrayLength = 0;
        for (int i = 1; i <= 99; i += 2) {
            arrayLength++;
        }
        System.out.println(arrayLength);
        int[] array = new int [arrayLength];
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
