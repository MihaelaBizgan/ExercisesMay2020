import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        //NumberFormat percent = new NumberFormat() - Nu putem instantia o clasa abstracta.

        String result = NumberFormat.getPercentInstance().format(0.1); // chaining methods
        String result1 = NumberFormat.getCurrencyInstance().format(1235265.564);
        String result2 = NumberFormat.getIntegerInstance().format(56.23);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        }
}
