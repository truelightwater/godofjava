package mentoring.monitor;

public class Main {
    public static void main(String[] args) {
        BalanceSystem bs = new BalanceSystem();     // 잔액 관리 시스템 생성

        User user0 = new User();         // 스레드 생성
        user0.setBalanceSystem(bs);      // 공유 객체 연결
        user0.start();                   // 스레드 시작

        User user1 = new User();         // 스레드 생성
        user1.setBalanceSystem(bs);      // 공유 객체 연결
        user1.start();                   // 스레드 시작

    }
}
