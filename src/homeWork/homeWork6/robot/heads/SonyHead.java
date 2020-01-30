package homeWork.homeWork6.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Says head Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
