package mentoring.monitor;

public class Account {
    private int account = 30000;

    public synchronized void withDraw(int money) {
        account -= money;
    }

    public synchronized void deposit(int money) {
        account += money;
    }
}
