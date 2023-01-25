package mentoring.explicit_lock;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();                       // 공유 객체 생성
        Baker[] baker = new Baker[10];                      // 제빵사 10명
        Consumer[] consumer = new Consumer[10];             // 손님 10명

        for (int i = 0; i < baker.length; i++) {
            baker[i] = new Baker(bakery);                   // 제빵사 스레드 생성
            baker[i].start();                               // 제빵사 스레드 실행
        }

        for (int i = 0; i < consumer.length; i++) {
            consumer[i] = new Consumer(bakery);             // 손님 스레드 생성
            consumer[i].start();                            // 손님 스레드 실행
        }

        // 스레드가 다 끝날 때 까지 Main 스레드 일시정지
        try {
            for (int i = 0; i < baker.length; i++) {
                baker[i].join();
            }

            for (int i = 0; i < consumer.length; i++) {
                consumer[i].join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 현재 빵의 개수 출력
        System.out.println();
        bakery.getBreadCount();
    }
}
