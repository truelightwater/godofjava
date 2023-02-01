package mentoring.ArrayList;

public class ArrayList {
    // 몇 개의 데이터가 리스트에 있는지 확인하는 size
    private int size = 0;
    // 저장할 수 있는 데이터의 총 개수 : 100개
    private Object[] elementData = new Object[100];

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;

        return true;
    }

    public boolean add(int index, Object element) {
        for (int loop = size - 1; loop >= index; loop--) {
            elementData[loop + 1] = elementData[loop];
        }
        elementData[index] = element;
        size++;

        return true;
    }

    public Object remove(int index) {
        Object removed = elementData[index];
        for (int loop = index + 1; loop <= size - 1; loop++) {
            elementData[loop - 1] = elementData[loop];
        }
        size--;
        elementData[size] = null;

        return removed;
    }

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        for (int loop = 0; loop < size; loop++) {
            if (o.equals(elementData[loop])) {
                return loop;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }


    class ListIterator {
        private int nextIndex = 0;

        public Object next() {
            return elementData[nextIndex++];
//            Object returnData = elementData[nextIndex];
//            nextIndex++;
//            return returnData;
        }

        public boolean hasNext() {
            return nextIndex < size();
        }

        public Object previous() {
            return elementData[--nextIndex];
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public void add(Object element) {
            ArrayList.this.add(nextIndex++, element);
        }

        public void remove() {
            ArrayList.this.remove(nextIndex - 1);
            nextIndex--;
        }



    }



    public String toString() {
        String str = "[";

        for (int loop = 0; loop < size; loop++) {
            str += elementData[loop];
            if (loop < size - 1) {
                str += ",";
            }
        }

        return str + "]";
    }
}
