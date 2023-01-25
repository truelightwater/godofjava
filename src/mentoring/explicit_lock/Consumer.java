package mentoring.explicit_lock;

public class Consumer extends Thread {
    private static int nameCount = 1;           // 스레드 이름짓기용 카운트
    private Bakery bakery;                      // 공유 객체 변수

    public Consumer(Bakery bakery) {
        this.bakery = bakery;                   // 공유 객체 획득
        this.setName("손님" +nameCount++);       // 스레드 이름 짓기
    }

    @Override
    public void run() {
        try {
            bakery.buyBread();                  // 빵 구매하기
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

