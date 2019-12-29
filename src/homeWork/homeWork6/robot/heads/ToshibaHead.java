package homeWork.homeWork6.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speek() {
        System.out.println("Says head Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
