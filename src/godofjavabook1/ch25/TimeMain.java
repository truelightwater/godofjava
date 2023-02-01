package godofjavabook1.ch25;

public class TimeMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}
