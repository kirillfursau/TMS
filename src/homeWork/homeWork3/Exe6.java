package homeWork.homeWork3;

public class Exe6 {
    public static void main(String[] args) {
        /*
        Создайте массив из 4 случайных целых чисел из отрезка [0;10],
        выведите его на экран в строку. Определить и вывести на экран
        сообщение о том, является ли массив строго возрастающей последовательностью.
        */
        int arrayLength = 4;
        int[] array;
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(" " + array[i]);
        }
        System.out.println();
        boolean increase = true;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] >= array[i + 1]) {
                increase = false;
                System.out.println("The sequence does not increase");
                break;
            }
        }
        if (increase) {
            System.out.println("The sequence is increasing");
        }
    }
}


