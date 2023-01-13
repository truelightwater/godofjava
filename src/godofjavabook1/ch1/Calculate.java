package godofjavabook1.ch1;

public class Calculate {
  public static void main(String[] args) {
    Calculate sample = new Calculate();
    int num1 = 10;
    int num2 = 5;

    System.out.println("add = " +sample.add(num1, num2));
    System.out.println("subtract = " +sample.subtract(num1, num2));
    System.out.println("multiply = " +sample.multiply(num1, num2));
    System.out.println("divide = " +sample.divide(num1, num2));

  }

  public int add(int num1, int num2) {
    return num1 + num2;
  }

  public int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public int divide(int num1, int num2) {
    return num1 / num2;
  }
}
