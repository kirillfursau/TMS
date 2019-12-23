package homeWork.homeWork6.elonTusk;

public class Spaceport {
    void launch(IStart iStart) {
        iStart.preLaunchSystemCheck();
        if (iStart.preLaunchSystemCheck()) {
            iStart.engineStart();
            iStart.start();
        } else {
            System.out.println("Spaceport prelaunch check failed");
        }
    }
}