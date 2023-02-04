package mentoring.OOP2;

public class Accounting {
    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
