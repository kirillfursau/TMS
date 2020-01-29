package lessons.lesson14;

public class Account {
    long balance = 1000;

    public Account(long balance) {
        setBalance(balance);
    }

    public Account() {

    }

    @Override
    public void run() {

    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account account = new Account(1000);
        Thread thread = new Thread(String.valueOf(account.getBalance() - 1));
        Thread thread1 = new Thread(String.valueOf(account.getBalance() + 1));
    }
}

