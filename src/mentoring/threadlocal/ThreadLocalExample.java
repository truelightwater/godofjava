package mentoring.threadlocal;

public class ThreadLocalExample {
    public static class MyRunnable implements Runnable {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
        @Override
        public void run() {
            threadLocal.set((int) (Math.random() * 100D));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable shareRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(shareRunnableInstance);
        Thread thread2 = new Thread(shareRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}

