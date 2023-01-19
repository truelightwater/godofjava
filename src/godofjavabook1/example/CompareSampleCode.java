package godofjavabook1.example;

public class CompareSampleCode {
  public static void main(String[] args) {
    String s1 = "apple";
    String s2 = new String("apple");
    String s3 = new String("apple");
    String s4 = "apple";

    if(s1 == s2) {
      System.out.println("두개의 값이 같음.");
    } else {
      System.out.println("두개의 값이 같지 않음.");
    }

    if (s2 == s3) {
      System.out.println("두개의 값이 같음."); // 다만, hashCode()가 다르다.
    } else {
      System.out.println("두개의 값이 같지 않음.");
    }

    if (s1.equals(s2)) {
      System.out.println("두개의 값이 같음.");
    } else {
      System.out.println("두개의 값이 같지 않음.");
    }

    if (s1 == s4) {
      System.out.println("두개의 값이 같음.");
    } else {
      System.out.println("두개의 값이 같지 않음.");
    }
  }
}
