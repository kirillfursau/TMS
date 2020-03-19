package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;
import myFirstProject.model.exception.XOException;

import java.util.Arrays;
import java.util.stream.Stream;


public class FieldService {

    public Figure getNextFigure(Field field) {
        if (Arrays.stream(field.getFigures())
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el != null))
                .count() % 2 == 0) {
            return Figure.X;
        }
        return Figure.O;
    }

    public void makeMove(Field field, int x, int y) throws XOException {
        try {
            if (field.getFigure(x, y) != Figure.X && field.getFigure(x, y) != Figure.O) {
                field.setFigure(x, y, getNextFigure(field));
            } else {
                throw new AlreadyOccupiedException();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new MoveOutOfBoundsException();
        }
    }


    public boolean isFull(Field field) {
        return Arrays.stream(field.getFigures())
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el == null))
                .count() == 0;
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

