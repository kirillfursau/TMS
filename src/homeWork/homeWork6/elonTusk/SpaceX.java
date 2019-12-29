package homeWork.homeWork6.elonTusk;

public class SpaceX implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        int x = (int)(Math.random()*50);
        int y = (int)(Math.random()*50);
        if (x > y ){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("SpaceX engines are running. All systems are normal.");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Start SpaceX");
    }
}
