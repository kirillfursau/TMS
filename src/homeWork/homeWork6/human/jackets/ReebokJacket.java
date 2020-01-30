package homeWork.homeWork6.human.jackets;

public class ReebokJacket implements Jacket {
    public ReebokJacket() {
    }

    @Override
    public void putOnJacket() {
        System.out.println("Now I will be warmer in this Reebok jacket");
    }

    @Override
    public void putOffJacket() {
        System.out.println("Put my Reebok jacket back on, I'm freezing");
    }
}
