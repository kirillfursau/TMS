package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;
import myFirstProject.model.exception.XOException;


import java.util.*;
import java.util.stream.Stream;


public class FieldService {

    public Figure getNextFigure(Field field) {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getFigure(i, j) != null) {
                    figures.add(field.getFigure(i, j));
                }
            }
        }

        long counterX = Arrays.stream(field.getFigures())
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el == Figure.X))
                .count();

        long counterO = Arrays.stream(field.getFigures())
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el == Figure.O))
                .count();

        if (counterX == counterO) {
            return Figure.X;
        }
        return Figure.O;
    }


    public void makeMove(Field field, int x, int y) throws XOException {
        if (x > 2 || y > 2 || x < 0 || y < 0) {
            throw new MoveOutOfBoundsException();
        }
        if (field.getFigure(x, y) != Figure.X && field.getFigure(x, y) != Figure.O) {
            field.setFigure(x, y, getNextFigure(field));
        } else {
            throw new AlreadyOccupiedException();
        }
    }


    public boolean isFull(Field field) {
        long empty = Arrays.stream(field.getFigures())
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el == null))
                .count();
        if (empty > 0) {
            return false;
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

