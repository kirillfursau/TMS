package homeWork.homeWork3;

public class Exe1_reality {
    public static void main(String[] args) {
        /*
        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
        массива на экран сначала в строку, отделяя один элемент от другого пробелом,
        а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера.
        */
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
