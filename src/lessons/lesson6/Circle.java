package lessons.lesson6;

public class Circle extends Figure {
    private int radius;

    Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }


    int getRadius() {
        return radius;
    }

    @Override
    public String getFigureType() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return radius ^ 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean containsPoint(Point center) {
        return false;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println(radius);
    }
}
