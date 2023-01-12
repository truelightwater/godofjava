public class Calculate {
  public static void main(String[] args) {
    Calculate sample = new Calculate();
    sample.add(10, 5);
    sample.subtract(10, 5);
    sample.multiply(10, 5);
    sample.divide(10, 5);

  }

  public int add(int num1, int num2) {
    int sum = 0;
    sum = num1 + num2;

    return sum;
  }

  public int subtract(int num1, int num2) {
    int sum = 0;
    sum = num1 - num2;

    return sum;
  }

  public int multiply(int num1, int num2) {
    int sum = 0;
    sum = num1 * num2;

    return sum;
  }

  public int divide(int num1, int num2) {
    int sum = 0;
    sum = num1 / num2;

    return sum;
  }
}
