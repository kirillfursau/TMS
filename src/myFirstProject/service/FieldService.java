package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;
import myFirstProject.model.exception.XOException;


import java.util.*;


public class FieldService {

    Figure getNextFigure(Field field) {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) != null) {
                    figures.add(field.getFigure(i, j));
                }
            }
        }
        int counterX = (int) figures.stream()
                .filter(Figure -> Figure == myFirstProject.model.Figure.X)
                .count();

        int counterO = (int) figures.stream()
                .filter(Figure -> Figure == myFirstProject.model.Figure.O)
                .count();

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

    public void makeMove(Field field, int x, int y) throws XOException {
        whoTurn(field);
        if (x > 2 || y > 2) {
            throw new MoveOutOfBoundsException();
        }
        if (field.getFigure(x, y) != Figure.X && field.getFigure(x, y) != Figure.O) {
            field.setFigure(x, y, getNextFigure(field));
        } else {
            throw new AlreadyOccupiedException();
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
                if (field.getFigure(i, j) == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(field.getFigure(i, j) + " ");
                }
            }
            System.out.println();
        }
    }
}

