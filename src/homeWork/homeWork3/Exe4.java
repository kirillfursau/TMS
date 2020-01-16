package homeWork.homeWork3;

public class Exe4 {
    public static void main(String[] args) {
        /*
        Создайте массив из 20 случайных целых чисел из отрезка [0;20].
        Выведите массив на экран в строку. Замените каждый элемент с
        нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        */
        int arrayLength = 20;
        int[] array;
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 21);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(" " + array[i]);
        }
    }
}