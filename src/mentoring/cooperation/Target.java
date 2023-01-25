package mentoring.cooperation;

public class Target extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 1000000000; i++) { }       // RUNNABLE

        try {
            Thread.sleep(500);                     // TIMED_WAITING
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (long i=0; i <1000000000; i++) { }           // RUNNABLE
    }
}
