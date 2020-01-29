package lessons.lesson14;



public class CounterThread extends Thread{
    public CounterThread() {
    }
    @Override
    public void run(){
        int number;
        for (number = 0;number < 1000000000;number++){
            if (number % 1000 == 0 && isInterrupted()){
                System.out.println(number);
                return;
            }
        }
    }

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        try {
            counterThread.start();
            sleep(100);
            counterThread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

