package mentoring.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    static final int LOOP = 10000;

    public static void main(String[] args) {
        // 세마포어 객체생성(permit=1, [공유자원 1개] / fair=true, [FIFO] )
        Semaphore s = new Semaphore(1, true);
        // 공유객체 생성
        Account account = new Account(s);

        // 스레드 생성
        Thread depositThread1 = new Thread(new Deposit(account));
        Thread withDrawThread1 = new Thread(new WithDraw(account));
        Thread depositThread2 = new Thread(new Deposit(account));
        Thread withDrawThread2 = new Thread(new WithDraw(account));

        depositThread1.setName("경수 입금");
        withDrawThread1.setName("경수 출금");
        depositThread1.setName("윤애 입금");
        withDrawThread2.setName("윤애 출금");

        // 스레드 실행
        depositThread1.start();
        withDrawThread1.start();
        depositThread2.start();
        withDrawThread2.start();

        // 스레드 정지
        try {
            depositThread1.join();
            withDrawThread1.join();
            depositThread2.join();
            withDrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 잔액 출력
        account.printBalacne();
    }


}
