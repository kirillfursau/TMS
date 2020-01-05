package homeWork.homeWork6.robot.hands;

public class ToshibaHand implements IHand {
    private int price;
    boolean upHandChecker= false;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        if (!upHandChecker) {
            System.out.println("Up Toshiba hand");
            upHandChecker = true;
        } else {
            System.out.println("My Toshiba hand is up");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
