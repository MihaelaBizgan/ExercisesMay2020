import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
         else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
         else
            System.out.println(number);
            }
        }



//        switch (number){
//            case 1:
//                if(number % 5 == 0)
//                    System.out.println("Fizz");
//                break;
//            case 2:
//                if(number % 3 == 0)
//                    System.out.println("Buzz");
//                break;
//            case 3:
//                if(number % 5 == 0 && number % 3 == 0)
//                    System.out.println("FizzBuzz");
//                break;
//            default:
//                if( number % 5 != 0 && number % 3 != 0)
//                    System.out.println(number);
//        }


