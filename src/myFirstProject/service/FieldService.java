package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;

import java.util.Scanner;

public class FieldService {

    Figure getNextFigure(Field field) {
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) == Figure.X) {
                    counterX++;
                }
                if (field.getFigure(i, j) == Figure.O) {
                    counterO++;
                }
            }
        }
        if (counterX == counterO) {
            return Figure.X;
        }
        return Figure.O;
    }

    void whoTurn(Field field) {
        if (getNextFigure(field) == Figure.O) {
            System.out.println("Turn O");
        } else {
            System.out.println("Turn X");
        }
    }

    public void makeMove(Field field) {
        whoTurn(field);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = scanner.nextInt();
        System.out.print("Enter y : ");
        int y = scanner.nextInt();
        if (field.getFigure(x, y) != Figure.X && field.getFigure(x, y) != Figure.O) {
            field.setFigure(x, y, getNextFigure(field));
        }
    }


    public boolean isFull(Field field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) != Figure.O && field.getFigure(i, j) != Figure.X) {
                    return false;
                }
            }
        }
        return true;
    }

    public void draw(Field field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field.getFigure(i, j) + " ");
            }
            System.out.println();
        }
    }
}

