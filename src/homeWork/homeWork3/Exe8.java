package homeWork.homeWork3;


public class Exe8 {
    public static void main(String[] args) {
        /*
        Создайте два массива из 10 целых случайных чисел из отрезка [0;9]
        и третий массив из 10 действительных чисел. Каждый элемент с i-ым
        индексом третьего массива должен равняться отношению элемента из
        первого массива с i-ым индексом к элементу из второго массива с
        i-ым индексом. Вывести все три массива на экран
        (каждый на отдельной строке), затем вывести количество целых
        элементов в третьем массиве.
        */
        int length = 10;
        int[] firstArray = new int[length];
        int[] secondArray = new int[length];
        double[] thirdArray = new double[length];
        int countEven = 0;
        for (int i = 0; i < length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            secondArray[i] = (int) (Math.random() * 10);
            thirdArray[i] = (double) (firstArray[i]) / secondArray[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(" " + firstArray[i]);
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(" " + secondArray[i]);
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(" " + thirdArray[i]);
            if (thirdArray[i] % 1 == 0) {
                countEven++;
            }
        }
        System.out.println();
        if (countEven == 1) {
            System.out.println(countEven + " Integer");
        } else {
            System.out.println(countEven + " Integers");
        }
    }
}