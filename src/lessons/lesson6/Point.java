package lessons.lesson6;

public class Point implements Printable {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void printInformation() {
        System.out.println(x + " " + y);
    }
}
