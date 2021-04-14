import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
//        int[][] numbers = {{7, 2, 0, 4, 5}, {4, 5, 6}};
//
//        int x = 1;
//        x = x + 2; // sau asa : x += 2;
//        int y = x++;
//        int y1 = ++x;
//
//        /* Arrays.toString(numbers); */
//        //Arrays.sort(numbers);
//        System.out.println(Arrays.deepToString(numbers));
//        //System.out.println(numbers.length);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(y1);
//
//        //Write a Java program to sum values of an array: [1, 7, 3, 10, 9]. Output : 30.
//        int[] array = {1, 7, 3, 10, 9};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++)
//            sum = sum + array[i];
//        System.out.println("The sum of array's member is: " + sum);


//        //Write a Java program to calculate the average value of array elements: [1, 7, 3, 10, 9] Output: 6.
//        int[] array1 = {1, 7, 3, 10, 9};
//        int sum1 = 0;
//        for (int i = 0; i < array1.length; i++) {
//            sum1 = sum1 + array1[i];
//        }
//        System.out.println("The average value of array1 elements is: " + sum1 / array1.length);


        //Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9] Output: 1, 7, 3, 9.
        int[] array = {1, 7, 3, 10, 9};
        for (int i = 0; i <= array.length; i++) {
            if (array[i] % 2 == 0) {
                break;
            }else {
                System.out.println();
            }

            System.out.println("Al odd numbers from array: " + array[i]);


        }
    }
}

