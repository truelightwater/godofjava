package mentoring.oop;

public class B extends A implements Enlistable, Marriedable {

    public void print() {
        System.out.println("Mentoring Test");
    }

    @Override
    public void enlist() {
        System.out.println("나라의 부름을 받아 군대로 입대합니다!");
    }

    @Override
    public void married() {
        System.out.println("2022년 7월 2일에 결혼했습니다!");
    }
}