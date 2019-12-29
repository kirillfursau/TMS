package lessons.lesson6;

public class Square extends Rectangle {

    Square(Point center, int width) {
        super(center, width, width);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.SQUARE;
    }

}
