import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalcByMyself {
    public static void main(String[] args) {
        //Principal = 100000, Annual Interest = 3.92, Period(years) 30;
        final int PERCENT = 100;
        final int MONTHS_IN_YEAR = 12;
        final int MIN = 1_000;
        final int MAX = 1_000_000;
        final double MAX_OF_RATE = 30;
        final int MAX_NO_OF_YEARS = 30;

        System.out.println("This program calculates mortgage!");
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        double monthlyInterest = 0;
        int numberOfPayments = 0;

        while (true) {
            System.out.println("Principal ($ 1K - $ 1M): ");
            principal = scanner.nextInt();
            if (principal >= MIN && principal <= MAX)
                break;
            System.out.println("Enter a number between 1000 and 1000000. ");
        }
        while (true) {
            System.out.println("Annual Interest Rate: ");
            double annualInterest = scanner.nextDouble();
            if (annualInterest > 0 && annualInterest <= MAX_OF_RATE) {
                monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
                break;
            }
            System.out.println("Enter a value between 1 and 30: ");
        }

        while (true) {
            System.out.println("Period(Years): ");
            int period = scanner.nextInt();
            if (period > 0 && period <= MAX_NO_OF_YEARS) {
                numberOfPayments = MONTHS_IN_YEAR * period;
                break;
            }
            System.out.println("Enter a value between 1 and 30: ");
        }

        System.out.println("Mortgage:");
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / Math.pow(1 + monthlyInterest, numberOfPayments - 1);
        System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
