class LoanCalculator {
    private double principal;
    private double annualInterestRate;
    private int years;

    public LoanCalculator(double principal, double annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateTotalPayment() {
        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfMonths = years * 12;
        double onePlusMonthlyRate = 1.0 + monthlyInterestRate;
        double totalPayment = (principal * Math.pow(onePlusMonthlyRate, numberOfMonths) * monthlyInterestRate) / (Math.pow(onePlusMonthlyRate, numberOfMonths) - 1);
        return totalPayment;
    }
}

class LoanPaymentCalculator {
    public static void main(String[] args) {
        double principal = 500000;  // Principal amount in Rwandan Francs
        double annualInterestRate = 0.18;  // 18% annual interest rate
        int years = 3;  // Number of years

        LoanCalculator bobLoan = new LoanCalculator(principal, annualInterestRate, years);

        double totalPayment = bobLoan.calculateTotalPayment();

        System.out.println("Principal Amount: " + principal + " Rwandan Francs");
        System.out.println("Annual Interest Rate: " + (annualInterestRate * 100) + "%");
        System.out.println("Number of Years: " + years);
        System.out.println("Total Payment with Compound Interest: " + totalPayment + " Rwandan Francs");
    }
}
    
