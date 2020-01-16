package homeWork.homeWork3;

import java.util.Scanner;

public class ProjectX {
    public static void main(String[] args) {
        /*
        Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока.
        Они по очереди вводят координаты клетки в которую хотят сделать ход.
        После каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
        Игра продолжается до победы одного из игроков или ничьи.
        */
        Scanner sc = new Scanner(System.in);
        int length = 3;
        int heigth = length;
        int[][] array = new int[length][heigth];
        String[][] oXArray = new String[length][heigth];
        int[] closeArray = new int[9];
        int count = 1;
        int close = 0;
        boolean game = true;
        boolean place = true;
        int x = 0;
        int o = 0;
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = count;
                count++;
            }
        }
        System.out.println();
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < length; j++) {
                oXArray[i][j] = "-";
            }
        }
        while (game) {
            for (int i = 0; i < heigth; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print("  " + array[i][j]);
                }
                System.out.println();
            }
            while (place) {
                System.out.println("Select field");
                System.out.print("Turn x : ");
                x = sc.nextInt();
                for (int i = 0; i < 9; i++) {
                    if (closeArray[i] == x || x > 9) {
                        place = true;
                        System.out.println("Invalid field.");
                        break;
                    } else {
                        place = false;
                    }
                }
            }
            place = true;
            closeArray[close] = x;
            close++;
            for (int i = 0; i < heigth; i++) {
                for (int j = 0; j < length; j++) {
                    if (x == array[i][j]) {
                        oXArray[i][j] = "X";
                    }
                }
            }
            for (int i = 0; i < heigth; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print("  " + oXArray[i][j]);
                }
                System.out.println();
            }
            for (int p = 0; p < 3; p++) {
                if ((oXArray[p][0] == "X" && oXArray[p][1] == "X" && oXArray[p][2] == "X") ||
                        (oXArray[0][p] == "X" && oXArray[1][p] == "X" && oXArray[2][p] == "X")) {
                    System.out.println("X is winner");
                    game = false;
                    break;
                } else if ((oXArray[0][0] == "X" && oXArray[1][1] == "X" && oXArray[2][2] == "X") ||
                        (oXArray[2][0] == "X" && oXArray[1][1] == "X" && oXArray[0][2] == "X")) {
                    System.out.println("X is winner");
                    game = false;
                    break;
                }
            }
            if (close == 9) {
                System.out.println("Draw");
                game = false;
            }
            if (game == false) {
                break;
            } else {
                for (int i = 0; i < heigth; i++) {
                    for (int j = 0; j < length; j++) {
                        System.out.print("  " + array[i][j]);
                    }
                    System.out.println();
                }
                while (place) {
                    System.out.println("Select field");
                    System.out.print("Turn o : ");
                    o = sc.nextInt();
                    for (int i = 0; i < 9; i++) {
                        if (closeArray[i] == o || o > 9) {
                            place = true;
                            System.out.println("Invalid field.");
                            break;
                        } else {
                            place = false;
                        }
                    }
                }
                place = true;
                closeArray[close] = o;
                close++;
                for (int i = 0; i < heigth; i++) {
                    for (int j = 0; j < length; j++) {
                        if (o == array[i][j]) {
                            oXArray[i][j] = "O";
                        }
                    }
                }
                for (int i = 0; i < heigth; i++) {
                    for (int j = 0; j < length; j++) {
                        System.out.print("  " + oXArray[i][j]);
                    }
                    System.out.println();
                }
                for (int p = 0; p < 3; p++) {
                    if ((oXArray[p][0] == "O" && oXArray[p][1] == "O" && oXArray[p][2] == "O") ||
                            (oXArray[0][p] == "O" && oXArray[1][p] == "O" && oXArray[2][p] == "O")) {
                        System.out.println("O is winner");
                        game = false;
                        break;
                    } else if ((oXArray[0][0] == "O" && oXArray[1][1] == "O" && oXArray[2][2] == "O") ||
                            (oXArray[2][0] == "O" && oXArray[1][1] == "O" && oXArray[0][2] == "O")) {
                        System.out.println("O is winner");
                        game = false;
                        break;
                    }
                }
            }
        }
        System.out.println("Game is over");
    }
}
