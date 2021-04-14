import java.util.Scanner;

public class PowerOfThreeToOneHundred {
    //    public static void main(String[] args) {
//        System.out.println(rezPowerOf(100, 3));
//
//    }
//    //method to return the result
//    public static String rezPowerOf(int number, int powerOfNum) {
//        StringBuilder rez = new StringBuilder();
//        for (int i = 0; i <= number; i++) {
//            if (isPowerOf(i, powerOfNum)) {
//                rez.append(i).append(" ");
//            }
//        }
//        return rez.toString();
//    }
//
//    //method to calculate if the give number is a power of isPowerOf
//    public static boolean isPowerOf(double num, int numToCheck) {
//        if ((num < Math.pow(numToCheck, 2)) & num != numToCheck) {
//            return false;
//        }
//        return (num / numToCheck == 1) ? true : isPowerOf(num / numToCheck, numToCheck);
//    }
    public static void main(String[] args) {
        double result = 0;
        double i = 1;
        while (result < 100) {

            result = Math.pow(3, i);
            if (result < 100) {
                i++;
                System.out.println(result);
            }
        }
    }
}


