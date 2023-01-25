package mentoring.explicit_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bakery {
    private final Lock lock = new ReentrantLock();              // Lock 생성
    private final Condition notFull = lock.newCondition();      // 생산스레드 조건 생성
    private final Condition notEmpty = lock.newCondition();     // 소비스레드 조건 생성
    private static final int MAX_BREAD_COUNT = 3;               // 빵이 가질수 있는 최대 빵 개수
    private int breadCount = 0;                                 // 현재 빵집 안 빵의 개수

    public void makeBread() throws InterruptedException {
        lock.lock();                                            // Lock 확보

        try {                                                   // 생산 스레드 조건 검사 (while 문)
            while (breadCount == MAX_BREAD_COUNT) {             // 빵집에 빵이 3개면 FULL 가득참
                System.out.println(Thread.currentThread().getName() + ": 어후.. 빵이 너무많아!");
                System.out.println();
                notFull.await();                                // notFull 조건의 Wait Set 에서 대기
            }
            // 조건 충족 시 생산 스레드 일 시작
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + " : 빵 하나 생산");
            breadCount += 1;
            System.out.println("빵 개수 :" + breadCount);
            System.out.println();
            notEmpty.signal();
            /* 빵집에 빵이 존재하니 빵이 없어서 notEmpty 조건 Wait Set 에 대기하던 소비 스레드들 중 하나를 Entry Set 으로 보냄.
            만약 Waiting Set 이 비어져 있으면 signal 이 실종 될 가능성이 있다.
            이를 missed signal 이라 하는데, 몇 가지 오류가 발생 할 수 있기 때문에 몇가지 조치를 해야하지만 정확한 방법을 모르겠어서 일단 넘어가겠다. */

        } finally {
            lock.unlock();
            /* 한 스레드가 작업을 하던 중 에러로 인하여 인터럽트 되어 졌을 때 lock 을 내려놓아야 다음 스레드들이 이어서 일을 할 수 있다.
            그러므로 스레드가 인털버트 되어도 lock 을 놓을 수 있도록 finally 블럭 안에 lock.unlock()을 넣어준다.
            */
        }
    }

    public void buyBread() throws InterruptedException {
        lock.lock();                                            // lock 획득

        // 소비스레드 조건 검사 (while 문)
        try {
            while (breadCount == 0) {                           // 손님은 빵집에 빵이 없으면 구매할 수 없음
                System.out.println(Thread.currentThread().getName() + " : 에휴.. 빵이 없네...");
                System.out.println();
                notEmpty.await();                               // 빵이 없으니 notEmpty 의 Wait Set 에 잠시 대기
            }
            // 조건이 충족되면 실행
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + " : 빵 하나 소비!");
            breadCount -= 1;                                    // 빵 한개 소비하기
            System.out.println("빵 개수 : " + breadCount);
            System.out.println();
            notFull.signal();
            // 더 이상 가득 차 있지 않으니 notFull Wait Set 에서 대기하던 생산스레드 하나를 Entry Set 으로 이동

        } finally {
            lock.unlock();
        }
    }
    // 빵의 총 개수 출력하기
    public void getBreadCount() {
        System.out.println("총 남은 빵 개수 : " +breadCount);
    }


}
