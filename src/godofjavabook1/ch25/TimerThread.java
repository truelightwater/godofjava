package godofjavabook1.ch25;

import java.util.Date;

public class TimerThread extends Thread {

    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {

        int count = 0;
        while (count<10) {
            try {
                Thread.sleep(1000);
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime)+" "+currentTime);

                if (count > 10) {
                    break;
                }
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

