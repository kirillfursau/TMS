package homeWork.homeWork6.human.jackets;

public class PumaJacket implements Jacket {
    @Override
    public void putOnJacket() {
        System.out.println("Now I will be warmer in this Puma jacket");
    }

    @Override
    public void putOffJacket() {
        System.out.println("Put my Puma jacket back on, I'm freezing");
    }
}
