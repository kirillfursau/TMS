package homeWork.homeWork6.human.pants;

public class PumaPants implements Pants {
    public PumaPants() {
    }

    @Override
    public void putOnPants() {
        System.out.println("Now i'm in my Puma pants");
    }

    @Override
    public void putOffPants() {
        System.out.println("Good thing I took off these Puma pants. Nike pants will be cooler");
    }
}
