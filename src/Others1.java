import java.util.Scanner;

public class Others1 {
    public static void main(String[] args) {
        //Write a program that prints the first n numbers, with an n increment: n=4 Output: 4, 8, 12, 16.
        int min = 4;
        int max = 0;
        int increment = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max value: ");
        max = scanner.nextInt();
        System.out.println("First n numbers incremented by 4: ");

        for (int i = min; i <= max; i += increment) {
            System.out.println(i);
        }

    }
}

