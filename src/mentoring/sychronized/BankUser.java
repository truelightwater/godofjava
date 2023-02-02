package mentoring.sychronized;

import java.util.Random;

public class BankUser implements Runnable {
    private BankAccount account;
    private Random random = new Random();

    public BankUser(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int amount = random.nextInt(100);
            if (random.nextBoolean()) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }
}
