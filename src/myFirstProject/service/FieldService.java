package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;

public class FieldService {

    Figure getNextFigure(Field field) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) == Figure.X) {
                    counter++;
                }
            }
        }
        if (counter % 2 == 0) {
            return Figure.X;
        }
        return Figure.O;
    }

    void makeMove(Field field, int x, int y) {
        if (field.getFigure(x, y) != Figure.O && field.getFigure(x, y) != Figure.X) {
            field.setFigure(x, y, getNextFigure(field));
        }
    }

    boolean isFull(Field field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) != Figure.O && field.getFigure(i, j) != Figure.X) {
                    return false;
                }
            }
        }
        return true;
    }

    void draw(Field field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(field.getFigure(i, j));
            }
            System.out.println();
        }
    }
}

