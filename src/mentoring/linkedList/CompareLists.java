package mentoring.linkedList;

import mentoring.ArrayList.*;

public class CompareLists {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.addLast(10);
        array.addLast(20);
        array.addLast(30);
        array.addFirst(5);
        array.get(2);
        ArrayList.ListIterator ai = array.listIterator();
        while (ai.hasNext()) {
            if ((int) ai.next() == 20) {
                ai.add(25);
            }
        }


        LinkedList linked = new LinkedList();
        linked.addLast(10);
        linked.addLast(20);
        linked.addLast(30);
        linked.addLast(5);
        linked.get(2);
        LinkedList.ListIterator li = linked.listIterator();
        while (li.hasNext()) {
            if ((int)li.next() == 20) {
                li.add(25);
            }
        }

    }
}
