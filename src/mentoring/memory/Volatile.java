package mentoring.memory;

public class Volatile {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgreoudThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
            }
        });

        backgreoudThread.start();

        Thread.sleep(1000);
        stopRequested = true;
    }
}
