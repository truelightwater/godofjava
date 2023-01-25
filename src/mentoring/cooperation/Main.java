package mentoring.cooperation;

public class Main {
    public static void main(String[] args) {
        CheckThreadState cts = new CheckThreadState(new Target());
        cts.start();
    }
}
