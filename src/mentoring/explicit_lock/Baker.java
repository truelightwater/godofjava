package mentoring.explicit_lock;

public class Baker extends Thread {
    private static int nameCount = 1;        // 스레드 이름 짓기용 카운트
    private Bakery bakery;                  // 공유 객체 변수

    public Baker(Bakery bakery) {
        this.bakery = bakery;                // 공유 객체 획득
        this.setName("제빵사" +nameCount++);  // 스레드 이름 짓기
    }

    @Override
    public void run() {
        try {
            bakery.makeBread();             // 빵 만들기 시작
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
