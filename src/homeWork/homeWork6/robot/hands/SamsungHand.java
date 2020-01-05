package homeWork.homeWork6.robot.hands;

public class SamsungHand implements IHand {
    private int price;
    boolean upHandChecker = false;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        if (!upHandChecker) {
            System.out.println("Up Samsung hand");
            upHandChecker = true;
        } else {
            System.out.println("My Samsung hand is up");
        }
    }

    @Override
    public int getPrice() {
        return price;
    }
}
