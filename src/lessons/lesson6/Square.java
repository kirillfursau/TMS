package lessons.lesson6;

public class Square extends Rectangle {

    Square(Point point, int width, int height) {
        super(point, width, height);
    }

    @Override
    public String getFigureType() {
        return "Square";
    }

}
