package lessons.lesson14;

public class SleepThread extends Thread {
    public SleepThread() {
    }

    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println("Good morning! I'm awake");
        } catch (InterruptedException e) {
            System.out.println("Damn, neighbors, again. I'm awake.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SleepThread sleepThread = new SleepThread();
        int i = (int) (Math.random() * 11);
        System.out.println(i);
        try {
            sleepThread.start();
            sleepThread.sleep(i * 1000);
            sleepThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
