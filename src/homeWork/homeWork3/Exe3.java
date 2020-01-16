package homeWork.homeWork3;

public class Exe3 {
    public static void main(String[] args) {
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0; 99].
         Выведите массив на экран. Подсчитайте сколько в массиве чётных
         элементов и выведете это количество на экран на отдельной строке.
        */
        int arrayLength = 15;
        int[] array;
        array = new int[arrayLength];
        int evenNumbers = 0;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(" " + array[i]);
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println();
        System.out.println("Total even numbers " + evenNumbers);
    }
}
