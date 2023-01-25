package mentoring.semaphore.counting;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();        // 공유객체 도서관 생성
        Thread[] reader = new Thread[10];       // 접근 스레드 회원 10명 생성

        for (int i = 0; i < reader.length; i++) {
            reader[i] = new Thread(new Reader(library));        // 회원 10명 생성
            reader[i].setName("회원" + (i+1));                   // 회원 스레드 이름 설정
            reader[i].start();                                  // 회원 스레드 실행
        }

        try {
            for (int i = 0; i < reader.length; i++) {
                reader[i].join();                               // 회원스레드 일시정지
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
