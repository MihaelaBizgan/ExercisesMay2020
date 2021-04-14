import java.util.Scanner;

public class ReadingInputFromUser {
    public static void main(String[] args) {
        // reading input from the user
        Scanner scanner = new Scanner(System.in); // am creat scanner object
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name + ".");

    }
}
