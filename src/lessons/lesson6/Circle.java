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
    public FigureType getFigureType() {
        return FigureType.CIRCLE;
    }

    @Override
    public double getSquare() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean containsPoint(Point point) {
        if ((Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2) <= Math.pow(radius, 2))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Radius is " + radius + " .Square is " + getSquare() + " .Perimeter is " + getPerimeter() +
                " .Figure type is " + getFigureType());

    }
}
