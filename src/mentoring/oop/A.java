package mentoring.oop;

public class A {
    public String name;
    private int age;
    protected int tall;
    int weight;

    public void setAge(int age) { this.age = age; }
    public void showName() { System.out.println("My name is " + name); }
    public void input() {
        System.out.println("Studying");
    }
    public void print() {
        System.out.println("Test...");
    }
}
