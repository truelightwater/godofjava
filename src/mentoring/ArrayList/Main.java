package mentoring.ArrayList;
// 출처 : https://opentutorials.org/module/1335/8715
public class Main {
    public static void main(String[] args) {
        ArrayList numbers= new ArrayList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        ArrayList.ListIterator li = numbers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        while (li.hasNext()) {
            int number = (int)li.next();
            if (number == 30) {
                li.remove();
            }
        }
        System.out.println(numbers);
    }
}
