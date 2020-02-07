package myFirstProject.model;

public class Player {
    String name;
    Figure figure;

    public Player(String name, Figure figure) {
        setName(name);
        setFigure(figure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
