package lessons.lesson14;

public class Account {
    long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public Account() {

    }


    public static void main(String[] args) {
        Account account = new Account(1000);
        Thread thread = new Thread(() -> {
        for (int i = 0; i < 100_000; i++) {
            synchronized (account){account.balance++;}
        }});
        Thread thread1 = new Thread(() ->{
        for (int i = 0; i < 100_000; i++) {
            synchronized (account){account.balance--;}
        }});
        thread.start();
        thread1.start();
        System.out.println(account.balance);
    }
}

