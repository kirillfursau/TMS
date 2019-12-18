package lessons.lesson6;

abstract class Figure implements Printable {
    Point center;

    Figure(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public abstract String getFigureType();

    public abstract double getSquare();

    public abstract double getPerimeter();

    public abstract boolean containsPoint(Point center);


    @Override
    public void printInformation() {
        System.out.println(center);
    }
}
