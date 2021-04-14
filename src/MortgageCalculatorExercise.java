import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorExercise {
    public static void main(String[] args) {
        //Principal: 100000; Mortgage: $472.81
        //Annual interest rate:3.92, Period(Years): 30
        //M = P * (r(1+r) la puterea n ) / ( 1+r) la puterea n - 1

        final int MONTHS_IN_YEAR= 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest / PERCENT/ MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / Math.pow(1 + monthlyInterest, numberOfPayments - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



    }
}
