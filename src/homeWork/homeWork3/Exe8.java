package homeWork.homeWork3;


public class Exe8 {
    public static void main(String[] args) {
        int length = 10;
        int[] firstArray = new int[length];
        int[] secondArray = new int[length];
        float[] thirdArray = new float[length];
        int countEven = 0;
        for (int i = 0; i < length; i++) {
            firstArray[i] = (int) (Math.random() * 9);
            secondArray[i] = (int) (Math.random() * 9);
            thirdArray[i] = (float) (firstArray[i]) / (float) (secondArray[i]);
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