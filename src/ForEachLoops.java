public class ForEachLoops {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};
        // Varianta cu for loop
        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);
        System.out.println();

// Varianta cu for each loop
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
