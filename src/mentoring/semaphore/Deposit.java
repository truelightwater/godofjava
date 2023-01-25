package mentoring.semaphore;

public class Deposit implements Runnable {
    Account account;

    public Deposit(Account account) {
        this.account = account;
    }
    @Override
    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            account.deposit(10);
        }
    }
}
