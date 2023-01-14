package godofjavabook1.example;

public class OperatorTilde {
  public static void main(String[] args) {
    OperatorTilde sample = new OperatorTilde();
    byte b = 127;
    sample.printTildeResult(b);
    b = 4;
    sample.printTildeResult(b);
  }

  public void printTildeResult(byte b) {
    System.out.println("Original value = " + b);
    System.out.println("Tilde value = " + ~b);
  }
}
