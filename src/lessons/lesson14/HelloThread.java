package lessons.lesson14;

public class HelloThread extends Thread {
    public HelloThread() {

    }

    @Override
    public void run() {
        System.out.println("Hello, I am thread with ID = " + getId()
                + " , name = " + getName());
    }

    public static void main(String[] args) {
        for(int i = 0; i< 10;i++){
            HelloThread helloThread = new HelloThread();
            helloThread.start();
        }
    }
}
