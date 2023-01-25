package mentoring.sychronized;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int loop = 0; loop < 5; loop ++) {
            runSync.runCommonCalculate();
        }
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();

        try {
            thread1.join();     // join()이라는 메소드는 각각의 쓰레드에 대해서 호출한다.
            thread2.join();     // join()은 쓰레드가 종료될 때까지 기다리는 메소드이다.

            // getAmount() 결과는 join() 이후이므로 모든 쓰레드가 종료된 이후의 결과이다.
            System.out.println("Final value is " + calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
