package lessons.lesson14;


public class CounterThread extends Thread {
    /*
    3.1 Создать CounterThread, который создаёт переменную со значением 0 и миллиард раз прибавляет к ней единицу.
    Каждые 1000 итераций он проверяет, не прервали ли его, и если прервали - выводит на консоль текущее значение
    переменной и останавливается.
    3.2 В main запускаем CounterThread, ждём 0.1 секунды и прерываем CounterThread.
    3.3 Делаем выводы о том, сколько раз ваш комп может заинкрементить переменную за секунду, а также о том, что
    бы было, если бы тред не проверял, что его не прервали
    */
    public CounterThread() {
    }

    @Override
    public void run() {
        int number;
        for (number = 0; number < 1000000000; number++) {
            if (number % 1000 == 0 && isInterrupted()) {
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

