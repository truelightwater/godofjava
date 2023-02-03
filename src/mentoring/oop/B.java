package mentoring.oop;

public class B extends A implements Enlistable, Marriedable {

    Enlistable enlistable;
    Marriedable marriedable;

    public B(Enlistable enlistable, Marriedable marriedable) {
        this.enlistable = enlistable;
        this.marriedable = marriedable;
    }

    public void setEnlistable(Enlistable enlistable) {
        this.enlistable = enlistable;
    }

    public void setMarriedable(Marriedable marriedable) {
        this.marriedable = marriedable;
    }

    @Override
    public void enlist() {
        enlistable.enlist();
    }

    @Override
    public void married() {
        marriedable.married();
    }

    @Override
    public void input() {
        super.input();
    }

    public void print() {
        System.out.println("Mentoring Test");
    }
}