package mentoring.semaphore.counting;

import java.util.concurrent.Semaphore;

// 공유객체 Library 클래스
public class Library {
    // 공유자원은 3개
    private final int MAX_PERMIT = 3;

    // 도서관에 데미안 책이 총 3권이 있다.
    private Book[] books = {new Book("데미안_1"), new Book("데미안_2"), new Book("데미안_3")};

    // 데미안 3권의 책의 대출여부를 알려주는 배열
    private boolean[] beingRead = new boolean[MAX_PERMIT];

    // 세마포어 객체 생성(Counting Semaphore)
    private Semaphore s = new Semaphore(MAX_PERMIT, true);


    public Book checkOut() throws InterruptedException {
        s.acquire(); // 대출이 가능한지 세마포어 동기화 검사

        // 가능하다면 임계영역 접근, 불가능하면 대기

        //------------ 임계영역 시작 ------------//

        return getAvailableBook(); // 대출 메소드 호출
    }

    // 대출 메소드
    public Book getAvailableBook() {
        Book book = null;

        for (int i = 0; i < MAX_PERMIT; i++) {
            // 데미안 3권 중 이용가능한 책 탐색
            if (!beingRead[i]) {
                beingRead[i] = true; // true 를 넣어 '대출중' 으로 바꿈
                book = books[i];     // 해당 책의 객체주소 획득

                System.out.println(Thread.currentThread().getName() +"님 대출완료 : " +book.getName());
                break;
            }
        }
        return book; // 대출한 책의 객체 주소 획득
    }


    // 책 반납하기
    public void returnBook(Book book) {
        if (returnAvailableBook(book)) {       // 책 대출가능 상태로 돌려놓는 메소드 호출
            s.release();                // Lock 해제 공유자원 내려놓기
            //------------ 임계영역 끝 ------------//
        }
    }


    // 책 대출가능 상태로 돌려놓기
    public boolean returnAvailableBook(Book book) {
        for (int i = 0; i < MAX_PERMIT; i++) {
            if (book == books[i]) {     // 내가 대출했던 책 탐색
                beingRead[i] = false;   // false 를 넣어 반납되어 대출가능한 상태임을 표시

                System.out.println(Thread.currentThread().getName() + "님 반납완료 : " +book.getName());

                break;
            }
        }
        return true;
    }
}
