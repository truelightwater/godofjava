package mentoring.oop;

public class Main {
    public static void main(String[] args) {
        Marriedable marriedable = new Marriedable() {
            @Override
            public void married() {
                System.out.println("결혼합니다!");
            }
        };

        Enlistable enlistable = new Enlistable() {
            @Override
            public void enlist() {
                System.out.println("입대합니다!");
            }
        };

        Enlistable enlistable2 = new Enlistable() {
            @Override
            public void enlist() {
                System.out.println("학교갑니다!");
            }
        };

        B b = new B(enlistable, marriedable);
        b.enlist(); // 군대
        b.setEnlistable(enlistable2);
        b.enlist(); // 학교

//        new C(new B(new A())); <- 이렇게 포장하는 것 ???? 뭐지 ????

    }
}