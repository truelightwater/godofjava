package godofjavabook1.ch5;

public class SalaryManager {
  public static void main(String[] args) {
    SalaryManager manager = new SalaryManager();
    manager.getMonthlySalary(20000000);
  }

  public double getMonthlySalary(int yearlySalary) {

    double tax;
    double monthlySalary;
    double employmentIncome;
    double nationalPension;
    double HealthInsurance;


    monthlySalary = yearlySalary / 12.0;

    employmentIncome = calculateTax(monthlySalary);
    nationalPension = calculateNationalPension(monthlySalary);
    HealthInsurance = calculateHealthInsurance(monthlySalary);

    tax = employmentIncome + nationalPension + HealthInsurance;
    monthlySalary -= tax;

    System.out.println();
    System.out.println("Monthly's TotalAmount is " +monthlySalary);

    return monthlySalary;
  }

  public double calculateTax(double monthlySalary) {

    double employmentIncome = 0.0;
    employmentIncome = monthlySalary * 0.125;
    System.out.println("MonthlySalary's EmploymentIncome = " +employmentIncome);

    return employmentIncome;
  }

  public double calculateNationalPension(double monthlySalary) {
    double nationalPension = 0.0;
    nationalPension = monthlySalary * 0.081;
    System.out.println("MonthlySalary's NationalPension = " +nationalPension);

    return nationalPension;
  }

  public double calculateHealthInsurance(double monthlySalary) {
    double healthInsurance;
    healthInsurance = monthlySalary * 0.135;
    System.out.println("MonthlySalary's HealthInsurance = " +healthInsurance);

    return healthInsurance;
  }







}
