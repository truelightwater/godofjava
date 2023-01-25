package mentoring.monitor;

public class User extends Thread {
    static int userCount = 0;       // 스레드 이름짓기용 count
    private int withDraw;           // 출금액
    private BalanceSystem bs;       // 잔액 관리 시스템 참조변수

    public User() {
        setName("Thread" +userCount++);     // 스레드 이름짓기
    }

    public void setWithDraw() {
        // 1000, 2000, 3000, 4000, 5000 중 하나가 랜덤하게 선택
        this.withDraw = ((int)(Math.random()*5+1))*1000;
    }

    public void setBalanceSystem(BalanceSystem bs) {        // 잔약 관리 시스템과 연결(공유 객체)
        this.bs = bs;
    }

    @Override
    public void run() {
        while (true) {
            // 출금액 선정
                setWithDraw();
            // 메소드 return 값이 false면 반복문 탈출
                if(!bs.systemActivated(withDraw)) break;
        }
    }

}
