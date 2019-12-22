package homeWork.homeWork6.elonTusk;

public class Spaceport implements IStart{
    void launch(IStart iStart) {
        iStart.preLaunchSystemCheck();
        if (iStart.preLaunchSystemCheck()) {
            iStart.engineStart();
            iStart.start();
        } else {
            System.out.println("Spaceport prelaunch check failed");
        }
    }

    @Override
    public boolean preLaunchSystemCheck() {
        int i = (int) (Math.random() * 2);
        if (i == 1) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void engineStart() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Spacecraft launch");
    }
}