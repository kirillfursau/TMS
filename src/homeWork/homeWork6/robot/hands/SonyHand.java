package homeWork.homeWork6.robot.hands;

public class SonyHand implements IHand {
    private int price;
    boolean upHandChecker = false;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        if (!upHandChecker) {
            System.out.println("Up Sony hand");
            upHandChecker = true;
        } else {
            System.out.println("My Sony hand is up");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
