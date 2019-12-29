package homeWork.homeWork6.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("It is very difficult to walk on one Toshiba leg. I will probably jump");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
