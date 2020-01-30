package lessons.lesson14;

public class DaemonThread extends Thread {
    /*
    4.1 Создать поток DaemonThread, который раз в секунду не останавливаясь пишет "I'm daemon".
    4.2 В main создаём DaemonThread, спим три секунды и завершаемся.
    4.3 Запускаем main и видим, что наш демон не затыкается, потому что он собственно не демон. Делаем его
    демоном, перезапускаемся и видим, что теперь всё ок.
    */
    public DaemonThread() {
    }

    @Override
    public void run() {
        while (true) {
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
