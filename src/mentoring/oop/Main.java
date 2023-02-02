package mentoring.oop;
public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        // 확장
        a.input();      // Studying
        b.input();      // Studying
        c.input();      // Studying

        // 재사용성
        a.print();      // Test...
        b.print();      // Mentoring Test
        c.print();      // Coding Test

        // 다형성
        A a1 = new A();
        A b1 = new B();
        A c1 = new C();

        a1.print();     // Test...
        b1.print();     // Mentoring Test
        c1.print();     // Coding Test


    }
}
