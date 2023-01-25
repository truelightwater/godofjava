package mentoring.semaphore.counting;

// 공유 객체에 접근하는 스레드, Reader 스레드
public class Reader implements Runnable{

    Library library;
    Book book;

    public Reader(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        try {
            book = library.checkOut();      // acquire() 호출
            System.out.println(Thread.currentThread().getName() + "님이 대출중입니다.");

            Thread.sleep(1000);
            library.returnBook(book);       // release() 호출
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
