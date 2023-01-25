package mentoring.monitor;

// 잔액 관리 공유 클래스
public class BalanceSystem {
    private int balance = 30000;        // 공유 자원

    public int getBalance() {
        return balance;
    }

    ////////////// synchronized 안 됨
    public synchronized boolean systemActivated(int withDraw) {
        // 출금액이 잔액보다 큰 경우
        if (balance < withDraw) {
            System.out.println("잔고가 부족하여 출금할 수 없습니다.");
            return false;
        }
        // 출금액이 잔액보다 작은 경우
        System.out.println(Thread.currentThread().getName() +"의 출금 : " +withDraw+"원");

        try {
            Thread.sleep(2000);
        } catch (Exception e) { }

        balance-= withDraw;     // 출금
        System.out.println("현재잔액 : " + balance);

        return true;

    }
}
