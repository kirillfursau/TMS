package lessons.lesson14;

public class Account {
    /*
    6.1 Создаём класс Account с полем long balance с каким-нибудь начальным значением.
    6.2 Создаём в main два треда (передавая нужную лямбду в конструктор класса Thread), один из которых 100 тысяч раз
    кладёт на аккаунт рубль (увеличивает баланс на 1), а второй 100 тысяч раз снимает 1 рубль. Запускаем оба потока,
    ждём, пока оба отработают, выводим баланс.
    6.3 Осознаём, как же так, почему в итоге баланс изменился.
    6.4 Синхронизируем доступ к балансу, перезапускаемся и видим, что теперь всё ок.
    6.5 Пробуем устроить синхронизацию обоими способами: через synchronized блок и через synchronized методы (которые,
    возможно, придётся предварительно добавить в класс Account.
    6.6 Допиливаем класс Account: добавляем в него методы deposit(long amount) /увеличивает баланс/ и
    withdraw(long amount) /уменьшает баланс/ (если их ещё нет).
    6.7 В метод withdraw добавляем проверку, что денег собственно достаточно. Если их недостаточно, то ждём,
    пока их станет достаточно (метод wait()). В то же время в метод deposit добавляем оповещение всех, кто ждёт
    апдейты по этому аккаунту, что денег стало больше (метод notifyAll()).
    6.8 Добавляем логирование (вывод в консоль) всего интересного, что происходит: успешная попытка снятия денег,
    ожидание поступления денег на баланс, поступление денег на баланс. Везде выводим текущий баланс.
    6.9 В main создаём аккаунт, снимаем с него деньги в большем количестве, чем там есть (можно за несколько раз и с
    элементом случайности, чтобы интереснее было) и потом через некоторое время (секунду) кладём деньги на баланс.
    */
    long balance = 1000;

    public Account(long balance) {
        this.balance = balance;
    }

    public Account() {

    }

    public synchronized void deposit(long amount) {
        System.out.println(balance + " when try to deposit");
        balance = balance + amount;
        System.out.println(balance + " after deposit");
        notifyAll();
    }

    public synchronized void withdraw(long amount) {
        System.out.println("Try to withdraw " + balance + ". Amount try to withdraw " + amount);
        while (balance - amount < 0) {
            try {
                System.out.println("Cant with draw");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance = balance - amount;
        System.out.println(balance + " when withdraw");
    }

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(1000);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (account) {
                    account.balance++;
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (account) {
                    account.balance--;
                }
            }
        });
        thread.start();
        thread.join();
        thread1.start();
        thread1.join();
        System.out.println("Thread " + account.balance);
        Thread thread2 = new Thread(() -> account.withdraw(1001));
        Thread thread3 = new Thread(() -> account.deposit(1000));
        thread2.start();
        thread3.start();
        thread2.join();
        thread3.join();
        System.out.println(account.balance + " end balance");
    }
}

