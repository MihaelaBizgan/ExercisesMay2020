import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int age = 30; // = este operator de atribuire.
        age = 35;
        int temperature = 25;
        byte myAge = 36;
        long viewsCount = 3_256_856_984L;
        float price = 10.99F;
        char letter = 'M';
        boolean isEligible = false;

        //Reference types....complex objects
        byte herAge = 40;
        Date now = new Date(); // Am creat o instanta a clasei Date.
        //now.getTime();

        byte x = 1;
        byte y = x;
        x = 2;

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;

        String message = "  Hello world" + "   !!";
        message.endsWith("!!");
        message.length();
        message.indexOf("e");
        message.replace("!","??");

        System.out.println(age);
        System.out.println(temperature);
        System.out.println(now);
        System.out.println(y);

        System.out.println(point2);

        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!","?"));
        // Target = parametru, replacement = arguments;
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
    }
}
