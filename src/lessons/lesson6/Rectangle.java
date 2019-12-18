package lessons.lesson6;

import java.sql.SQLOutput;

public class Rectangle extends Figure {
    int width;
    int height;

    Rectangle(Point point, int width, int height){
        super(point);
        this.width = width;
        this.height = height;
    }

    int getWidth(){
        return width;
    }
    int getHeight(){
        return width;
    }

    @Override
    public String getFigureType() {
        return "Rectangle";
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
    public boolean containsPoint(Point center) {
        return false;
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println(width + " " + height );
    }
}
