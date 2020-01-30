package lessons.lesson14;

public class HelloThread extends Thread {
    /*
    1.1 Создать HelloThread, метод run() которого выводит в консоль: "Hello, I am thread with ID = {id},
    name = {name}", где вместо {id} и {name} выводятся id и name треда.
    1.2 Создать в main 10 экземпляров HelloThread, запустить их все, после чего написать в консоли всё то же
    самое для основного треда.
    */
    public HelloThread() {

    }

    @Override
    public void run() {
        System.out.println("Hello, I am thread with ID = " + getId()
                + " , name = " + getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            HelloThread helloThread = new HelloThread();
            helloThread.start();
        }
    }
}
