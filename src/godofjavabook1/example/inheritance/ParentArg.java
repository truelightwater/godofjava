package godofjavabook1.example.inheritance;

public class ParentArg {

  public ParentArg(String name) {
    System.out.println("ParentArg("+name+") Constructor");
  }

  public ParentArg(InheritancePrint obj) {
    System.out.println("ParentArg(Inheritance) Constructor");
  }

  public void printName() {
    System.out.println("Parent printName()");
  }
}
