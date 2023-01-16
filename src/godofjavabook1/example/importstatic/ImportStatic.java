package godofjavabook1.example.importstatic;

import static godofjavabook1.example.SubStatic.*;

public class ImportStatic {
  public static void main(String[] args) {
    subStaticMethod();
    System.out.println(CLASS_NAME);
  }
}
