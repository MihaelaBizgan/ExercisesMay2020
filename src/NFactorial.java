public class NFactorial {
    //Write a java program to calculate the factorial value of given number: n=5 Output: 120 (1*2*3*4*5)
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int factorial = 1;
        while (i <= n){
            factorial = factorial * i;
            i++;
        }
        System.out.print("5 Factorial: " + factorial);
    }
}
