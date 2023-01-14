package godofjavabook1.ch6;

public class InterestManager {

  public static void main(String[] args) {
    InterestManager manager = new InterestManager();

    for (int day = 10; day <= 365; day+=10) {
      double totalAmount = 0.0;

      totalAmount = manager.calculateAmount(day, 1000000);
      System.out.println("Day = " +day+ " / Total Amount = "+totalAmount);
    }
  }

  public double getInterestRate(int day) {
    double interest = 0.0;

    if (day <= 90){
      interest = 0.005;
    } else if (91 <= day && day <=180 ) {
      interest = 0.01;
    } else if (181 <= day && day <= 364) {
      interest = 0.02;
    } else if (day == 365) {
      interest = 0.056;
    }
    
    return interest;
  }

  public double calculateAmount(int day, long amount) {
    double totalAmount = 0.0;
    double rate = 0.0;
    double dayPerRate = 0.0;

    dayPerRate = getInterestRate(day);
    rate = amount * dayPerRate;
    totalAmount = amount + rate;

    return  totalAmount;
  }

}
