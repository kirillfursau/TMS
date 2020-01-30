package homeWork.homeWork6.human.pants;

public class NikePants implements Pants {
    public NikePants() {
    }

    @Override
    public void putOnPants() {
        System.out.println("Now i'm in my favorite Nike pants");
    }

    @Override
    public void putOffPants() {
        System.out.println("If I walk without Nike the pants on the street it will not be very cool");
    }
}
