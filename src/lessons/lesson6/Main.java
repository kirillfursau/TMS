package lessons.lesson6;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(4,3 );
        Circle c1 = new Circle(p1, 2);
        System.out.println(c1.containsPoint(p2));
    }
}
