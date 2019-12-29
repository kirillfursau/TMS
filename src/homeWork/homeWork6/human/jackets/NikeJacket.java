package homeWork.homeWork6.human.jackets;

public class NikeJacket implements Jacket {
    @Override
    public void putOnJacket() {
        System.out.println("Now I will be warmer in this Nike jacket");
    }

    @Override
    public void putOffJacket() {
        System.out.println("Put my Nike jacket back on, I'm freezing");
    }
}
