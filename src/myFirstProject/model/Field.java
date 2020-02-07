package myFirstProject.model;

public class Field {
    static Figure[][] figure = new Figure[3][3];

    public Field(Figure[][] figure) {
        this.figure = figure;
    }

    public Figure getFigure(int x, int y) {
        return figure[x][y];
    }

    public void setFigure(int x, int y, Figure figureEnter) {
        figure[x][y] = figureEnter;
    }
}
