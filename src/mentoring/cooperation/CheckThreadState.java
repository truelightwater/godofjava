package mentoring.cooperation;

public class CheckThreadState extends Thread {
    Target target;

    public CheckThreadState(Target target) {
        this.target = target;
    }
    @Override
    public void run() {
        while (true) {
            Thread.State state = target.getState();         // 열거형 객체 생성
            System.out.println("현재 스레드 상태 : " + state);  // 열거 상수 출력

            if (state == Thread.State.NEW) {
                target.start();
            }

            if (state == State.TERMINATED) {
                System.out.println("스레드 종료");
                break;
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) { }
        }
    }
}
