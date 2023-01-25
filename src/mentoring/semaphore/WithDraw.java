package mentoring.semaphore;

public class WithDraw implements Runnable {
    Account account; // 공유객체

    public WithDraw(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            account.withdraw(10);
        }
    }


}
