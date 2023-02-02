package mentoring.sychronized;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread user1 = new Thread(new BankUser(account));
        Thread user2 = new Thread(new BankUser(account));

        user1.start();
        user2.start();

        user1.join();
        user2.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}
