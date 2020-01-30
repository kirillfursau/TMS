package lessons.lesson14;

public class SleepThread extends Thread {
    /*
    2.1 Создать SleeperThread, метод run() которого спит 5 секунд, после чего выводит в консоль "Good morning!
    I'm awake.", если этот тред не прервали. А если прервали, то выводит "Damn, neighbors, again. I'm awake."
    2.2 В main запускаем SleeperThread, после чего генерим случайное число от 1 до 10 (выведите его на консоль
    для наглядности), и через это число секунд интерраптим SleeperThread.
    */
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
