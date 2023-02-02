package mentoring.oop;

public class C extends A {
    public String name;

    public void print() {
        System.out.println("Coding Test");
    }
    public void print(String name) {
        System.out.println(name+"은 Coding Test 준비중이야.");
    }

    public void information() {
        // public 은 모두 접근 가능하다.
        name = "kks";
        // age 는 private 로 선언했기 때문에 public의 게터,세터로만 접근가능하다.
        setAge(30);
        // protected 는 같은 패키지, 상속이 되어있으면 사용가능하다.
        tall = 165;
        // default 는 같은 패키지에서 사용가능하다.
        weight = 64;
    }

}
