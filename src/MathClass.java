public class MathClass {
    public static void main(String[] args) {
        //int result = Math.round(1.4F);
        //int result = Math.max(1,2);
        //int result = Math.min(5,10);
        //int result = (int)Math.ceil(11.12D);
        //int result = (int)Math.floor(15.15D);
       // double result = Math.round(Math.random() * 100);
        // int result = (int) Math.round(Math.random() * 100);
        // int result = (int) Math.random() * 100; - Va rezulta intotdeauna 0 pentru ca prin conversia in int
        // se pierde zecimala si vom avea 0 * 100 = 0; De aceea, mai jos punem parantezele.
        int result = (int)(Math.random() * 100);
        System.out.println(result);
    }
}
