package mentoring.memory;

public class StackHeap4 {
    public static void main(String[] args) {
        String s = "hello";
        changeString(s);
        System.out.println(s);

    }

    public static void changeString(String param) {
        param += " world";
    }
}
