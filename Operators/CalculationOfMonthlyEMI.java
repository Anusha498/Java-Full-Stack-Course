package Operators;

public class CalculationOfMonthlyEMI {
    public static void main(String[] args) {
    double onRoadPrice = 2190887; //21,90,887
    double downPayment = 380000; //3,80,000
    double annualInterestRate = 9.5; //9.5%
    int loanPeriodYears = 4; //4 years

    double loanAmount = onRoadPrice - downPayment;
    double monthlyInterestRate = annualInterestRate / (12 * 100); // Convert annual rate to monthly and percentage to decimal
    int numberOfMonths = loanPeriodYears * 12; // Total number of monthly payments
  
    //EMI formula: EMI = [P * r * (1 + r)^n] / [(1 + r)^n - 1]
    double onePlusRPowerN = 1;
    for (int i = 0; i < numberOfMonths; i++) {
        onePlusRPowerN *= (1 + monthlyInterestRate);
    }
    double emi = (loanAmount * monthlyInterestRate * onePlusRPowerN) / (onePlusRPowerN - 1);
    
    //printing the values
    System.out.println("Monthly EMI: " + Math.round(emi));
    System.out.println("Total Payable Amount: " + Math.round(emi * numberOfMonths));
    System.out.println("Total Loan Amount : " + loanAmount);}
 }

