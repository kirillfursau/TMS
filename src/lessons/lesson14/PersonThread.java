package lessons.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonThread extends Thread {
    /*
    5.1 Создать PersonThread, который раз в секунду с вероятностью 20% заканчивается.
    5.2 В main создаём 10 PersonThread'ов и раз в секунду выводим кол-во тредов, которые ещё не закончились.
    5.3 Помним, что мы ненамного удачливее, чем PersonThread'ы, и радуемся, что живы. Каждую секунду. Окей, каждый день.
    */
    public PersonThread() {
    }

    @Override
    public void run() {
        while (true) {
            try {
                int chanceToDie = (int) (Math.random() * 10);
                sleep(1000);
                if (chanceToDie <= 1) {
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<PersonThread> personThreads = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            PersonThread personThread = new PersonThread();
            personThreads.add(personThread);
            personThreads.get(i).start();
        }
        while (personThreads.size() != 0) {
            for (int i = 0; i < personThreads.size(); i++) {
                if (!personThreads.get(i).isAlive()) {
                    personThreads.remove(i);
                }
            }
            System.out.println("Alive " + personThreads.size());
            sleep(1000);
        }
    }
}

