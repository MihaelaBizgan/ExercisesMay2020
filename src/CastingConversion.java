public class CastingConversion {
    public static void main(String[] args) {
       // implicit casting
        // byte > short > int > long > float > double
        double x = 1.1;
        int y = (int)x + 2; //
        System.out.println(y);

        String a = "1";
        int b = Integer.parseInt(a) + 10;
        System.out.println(b);

        String c = "1.1";
        double d = Double.parseDouble(c) + 20;
        System.out.println(d);
    }
}
