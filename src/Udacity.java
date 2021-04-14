public class Udacity {
    public static void main(String[] args) {
        String googol = "1";
        int len = googol.length();
        while(len < 101) {
            googol = googol + "0";
            len = googol.length();
            System.out.println(googol);
        }

        evenNumbers();
    }
    public static void evenNumbers(){
        for (int i = 2; i <= 10 ; i+=2) {
            System.out.println(i);

        }
    }

    public double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public void printTemperature(double temperature) {
        System.out.println("F" + temperature);
        System.out.println("C" + fahrenheitToCelsius(temperature));
    }

    public int diceRoll(int sides) {
        double randomNumber = Math.random() * sides;
        return (int) randomNumber;
    }

    public int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        if (roll1 == roll2) {
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            total = total + roll3 + roll4;
        }
        return total;
    }


}

