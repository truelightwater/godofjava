package godofjavabook1.example;

public class CompareSampleCode2 {
  public static void main(String[] args) {
    String str = "apple";
    String str4 = "apple";
    System.out.println(System.identityHashCode(str));
    System.out.println(System.identityHashCode(str4));

    String str1 = new String("apple");
    String str2 = new String("apple");

    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
  }
}
