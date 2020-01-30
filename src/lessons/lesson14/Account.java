package lessons.lesson14;

public class Account {
    long balance = 1000;

    public Account(long balance) {
        this.balance = balance;
    }

    public Account() {

    }

    public synchronized long deposit(long amount) {
        System.out.println(balance);
        notifyAll();
        return balance = balance + amount;
    }

    public synchronized long withdraw(long amount) {
        if (balance < balance + amount) {
            try {
                System.out.println(balance);
                wait();
                System.out.println(balance);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return balance - amount;
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
        System.out.println(account.balance);
        account.withdraw(100000000);
        System.out.println(account.balance);
        account.deposit(100000);
        System.out.println(account.balance);
    }
}

