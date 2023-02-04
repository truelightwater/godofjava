package mentoring.OOP2;

public class Print {
    public String delimiter = "";

    Print(String delimiter) {
        this.delimiter = delimiter;
    }

    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
