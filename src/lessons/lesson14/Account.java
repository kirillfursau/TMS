package lessons.lesson14;

public class Account {
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

