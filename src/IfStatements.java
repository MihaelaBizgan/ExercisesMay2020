import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        /* If temp is greater than 30 , It's a hot day, Drink water
        Otherwise, if it's between 20 and 30, It's a nice day
        Otherwise, It's cold.*/
        System.out.println("Temperature is: ");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink water.");
        } else if (temperature > 20)
            System.out.println("It's a nice day.");
        else
            System.out.println("It's a cold day.");

    }
}
