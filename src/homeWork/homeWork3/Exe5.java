package homeWork.homeWork3;

public class Exe5 {
    public static void main(String[] args) {
        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15]
        каждый, выведите массивы на экран в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и
        сообщите, для какого из массивов это значение оказалось больше
        (либо сообщите, что их средние арифметические равны).
        */
        int arrayLength = 5;
        int[] firstArray;
        int[] secondArray;
        firstArray = new int[arrayLength];
        secondArray = new int[arrayLength];
        double sumFirstArray = 0;
        double sumSecondArray = 0;
        for (int i = 0; i < arrayLength; i++) {
            firstArray[i] = (int) (Math.random() * 15);
            System.out.print(" " + firstArray[i]);
            sumFirstArray += firstArray[i];
        }
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            secondArray[i] = (int) (Math.random() * 15);
            System.out.print(" " + secondArray[i]);
            sumSecondArray += secondArray[i];
        }
        System.out.println();
        if (sumFirstArray / arrayLength < sumSecondArray / arrayLength) {
            System.out.println("The average arithmetic of the second array is greater");
        } else if (sumFirstArray / arrayLength > sumSecondArray / arrayLength) {
            System.out.println("The average arithmetic of the first array is greater");
        } else {
            System.out.println("The average arithmetic of arrays is equal");
        }
    }
}