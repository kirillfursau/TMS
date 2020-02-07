package myFirstProject.model;

public class Field {
    private Figure[][] figure = new Figure[3][3];

    public Figure getFigure(int x, int y) {
        return figure[x][y];
    }

    public void setFigure(int x, int y, Figure figureEnter) {
        figure[x][y] = figureEnter;
    }
}
