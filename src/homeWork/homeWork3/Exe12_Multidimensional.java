package homeWork.homeWork3;

import java.util.Scanner;

public class Exe12_Multidimensional {
    public static void main(String[] args) {
        /*
        Начало всех задач:
        Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
        1) Почитать сумму четных элементов стоящих на главной диагонали.
        2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).
        3)Проверить произведение элементов какой диагонали больше.
        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square array :  ");
        int height = sc.nextInt();
        int length = height;
        int[][] array = new int[height][length];
        int[][] transArray = new int[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
        int sumEvenMainDiagonal = 0;
        for (int i = 0; i < height; i++) {
            if (array[i][i] % 2 == 0) {
                sumEvenMainDiagonal += array[i][i];
            }
        }
        System.out.println("Sum of the even elements of the main diagonal : " + sumEvenMainDiagonal);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (j <= i && array[i][j] % 2 == 1) {
                    System.out.print(" " + array[i][j]);
                }
            }
        }
        System.out.println();
        int multReverseDiagonal = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i + j == length - 1) {
                    multReverseDiagonal *= array[i][j];
                }
            }
        }
        int multMainDiagonal = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    multMainDiagonal *= array[i][j];
                }
            }
        }
        if (multMainDiagonal > multReverseDiagonal) {
            System.out.println("Multiplication main diagonal is greater");
        } else if (multMainDiagonal == multReverseDiagonal) {
            System.out.println("Multiplication of diagonals is equals");
        } else {
            System.out.println("Multiplication reverse diagonal is greater");
        }
        int sumEvenReversDiagonal = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[i][j] % 2 == 0) {
                    sumEvenReversDiagonal += array[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers over the revers diagonal " + sumEvenReversDiagonal);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                transArray[i][j] = array[j][i];
                System.out.print(" " + transArray[i][j]);
            }
            System.out.println();
        }
    }
}