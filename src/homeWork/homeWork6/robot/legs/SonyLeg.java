package homeWork.homeWork6.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("It is very difficult to walk on one Sony leg. I will probably jump");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
