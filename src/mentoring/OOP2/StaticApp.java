package mentoring.OOP2;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
        // System.out.println(Foo.instanceVar);

        Foo.ClassMethod();
        // Foo.instanceMethod();

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println();
        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        System.out.println();
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        System.out.println();
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
    }
}
