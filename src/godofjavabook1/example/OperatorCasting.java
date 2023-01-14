package godofjavabook1.example;

public class OperatorCasting {
  public static void main(String[] args) {
    OperatorCasting sample = new OperatorCasting();
    sample.casting2();
  }

  public void casting2() {
    short shortValue =  256;
    byte byteValue = (byte) shortValue;
    System.out.println(byteValue);

    shortValue = 255;
    byteValue = (byte) shortValue;
    System.out.println(byteValue);

    int n = 150;
    System.out.println(Integer.toBinaryString(n));
    byte b = (byte) n;
    System.out.println(b);


  }
}
