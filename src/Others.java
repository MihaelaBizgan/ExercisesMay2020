public class Others {
    public static void main(String[] args) {
        String row1 = "    1    ";
        String row2 = "   222   ";
        String row3 = "  33333  ";
        String row4 = " 4444444 ";
        String row5 = "555555555";
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);

        // Write a program that prints the first n prime numbers: n = 4 Output: 2, 3, 5, 7 .
            int count = 0, nPrimeNumbers = 5, i;
            System.out.print("First " + nPrimeNumbers+ " Prime Numbers:");
            for (int num = 1; count < nPrimeNumbers; num++) {
                for (i = 2; num % i != 0; i++) ;
                if (i == num) {
                    System.out.print(" " + num);
                    count++;
                }
            }
        }
    }


