import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        // Print message"Hello!" 5 times.

        for (int i = 0; i < 5; i++)
            System.out.println("Hello!");

        for (int i = 1; i <= 5; i++)
            System.out.println("Hello! " + i);

        for (int i = 0; i < 5; i++)
            System.out.println("Hello World! " + i);

        for (int i = 5; i > 0; i--)
            System.out.println("Hi " + i);

        //Write a Java program that takes a number and prints its multiplication table up to 10: 8
        // Output: 8, 16, 24, 32, …, 80
        int x = 8;
        for (int i = 1; i < 11; i++) {
            System.out.print(x * i + " ");

        }

        // Write a Java program that lists all even numbers from 1 to 100 Output: 2, 4, 6, 8, ...,10.
        System.out.println();
        System.out.print("Even numbers up to 100: ");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        //Write a Java program that accepts an integer (n) and displays n, nn, nnn, nnnn, nnnnnn: 5
        // Output: 5, 55, 555, 5555, 55555
//        int num = 5;
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        for (int i = 1; i < 5; i++) {
//            num = (num * 10) + 5;
//            System.out.println(num);
//        }

        //Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both
        System.out.println();
        System.out.print("Numbers up to 100 divisible by 3: ");
        int a = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Numbers up to 100 divisible by 5: ");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Numbers up to 100 divisible by 3 and 5 : ");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 & i % 5 == 0)
                System.out.print(i + " ");
        }
        // Write a Java program that prints all the powers of a number under 100: 3 Output: 3, 9, 27, 81.
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        double result = Math.pow(3, n);
//        for (int i = 0; i < n; i++)
//            if (result < 100)
//            System.out.println(result);

    }
}










