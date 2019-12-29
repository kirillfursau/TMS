package lessons.lesson6;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(5,3 );
        Square square = new Square(p1,2);
        System.out.println(square.containsPoint(p2));

    }
}
