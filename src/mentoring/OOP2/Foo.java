package mentoring.OOP2;

public class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void ClassMethod() {
        System.out.println(classVar);
        // System.out.println(instanceVar);
    }

    public void instanceMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}
