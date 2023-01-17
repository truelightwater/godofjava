package godofjavabook1.ch13;

public abstract class AbstractList implements List {

  public abstract void add();

  public abstract void update(int index, Object value);

  public abstract void remove(int index);

  public void clear() {
    System.out.println("Clear");
  }

}
