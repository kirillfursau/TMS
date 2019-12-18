package lessons.lesson6;

public class Rectangle extends Figure {
    int width;
    int height;

    Rectangle(Point point, int width, int height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return width;
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.REACTANGLE;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public boolean containsPoint(Point point) {
        if (point.getX() <= center.getX() + width/2  && point.getY() <= center.getY() + height/2 ||
                point.getX() <= center.getX() - width/2  && point.getY() <= center.getY() - height/2){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println(width + " " + height);
    }
}
