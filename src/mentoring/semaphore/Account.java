package mentoring.semaphore;

import java.util.concurrent.Semaphore;

public class Account {
    private int balance = 0;  // 잔액
    Semaphore s;              // 세마포어 객체 참조변수

    public Account(Semaphore s) {
        this.s = s;
    }

    public void deposit(int money) {
        try {
            // 세마포어 객체를 통한 동기화 검사
            s.acquire();

            // 임계영역 (critical section)
            System.out.println(Thread.currentThread().getName() + " : " +money+"원");
            balance += money;
            System.out.println("현재 잔액 : " +balance+"원");

            // Lock 해제
            s.release();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdraw(int money) {
        try {
            // 세마포어 객체를 통한 동기화 검사
            s.acquire();

            // 임계영역
            System.out.println(Thread.currentThread().getName() + " : " +money+"원");
            balance -= money;
            System.out.println("현재 잔액 : " +balance+"원");
            System.out.println();

            // Lock 해제
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printBalacne() {
        System.out.println("현재 잔액 : " +balance);
    }

}
