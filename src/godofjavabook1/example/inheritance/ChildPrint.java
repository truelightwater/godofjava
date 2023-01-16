package godofjavabook1.example.inheritance;

public class ChildPrint extends Parent {
  public ChildPrint() {
    System.out.println("Child Constructor");
  }

  public void printAge() {
    System.out.println("printAge() - 18 month");
  }
}
