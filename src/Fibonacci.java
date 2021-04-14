public class Fibonacci {
    public static void main(String[] args) {
        //Write a Java program to print Fibonacci series of n terms: 10 Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//        int n = 10, t1 = 0, t2 = 1;
//        System.out.print("First " + n + " terms: ");
//
//        for (int i = 1; i <= n; ++i) {
//            System.out.print(t1 + " + ");
//
//            int sum = t1 + t2;
//            t1 = t2;
//            t2 = sum;
//        }
        int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
