package myFirstProject.service;

import myFirstProject.model.Field;
import myFirstProject.model.Figure;
import myFirstProject.model.exception.AlreadyOccupiedException;
import myFirstProject.model.exception.MoveOutOfBoundsException;

import java.util.InputMismatchException;
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
        try {
            whoTurn(field);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter x : ");
            int x = scanner.nextInt();
            System.out.print("Enter y : ");
            int y = scanner.nextInt();
            if (x > 2 || y > 2) {
                throw new MoveOutOfBoundsException();
            }
            if (field.getFigure(x, y) != Figure.X && field.getFigure(x, y) != Figure.O) {
                field.setFigure(x, y, getNextFigure(field));
            } else {
                throw new AlreadyOccupiedException();
            }
        } catch (AlreadyOccupiedException e) {
            System.out.println("This field is occupied");
        } catch (MoveOutOfBoundsException e) {
            System.out.println("There is no such field");
        } catch (InputMismatchException e) {
            System.out.println("You did't enter a number");
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
                    field.setFigure(i, j, Figure._);
                }
                System.out.print(field.getFigure(i, j) + " ");
            }
            System.out.println();
        }
    }
}

