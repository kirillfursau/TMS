package lessons.lesson14;

public class DaemonThread extends Thread {
    public DaemonThread() {
    }

    @Override
    public void run() {
        while (true){
            try {
                sleep(1000);
                System.out.println("I'm daemon");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        try {
            daemonThread.start();
            sleep(3000);
            daemonThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
