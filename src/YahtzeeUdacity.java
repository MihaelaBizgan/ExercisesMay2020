public class YahtzeeUdacity {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            int x = i - 1;
            System.out.println(x);
        }
        System.out.println("Total bricks in pyramid: " + countBlocks(5));
    }

    public int diceRoll() {
        double randomNumber = Math.random();
        return (int) randomNumber;
    }

    public int keepRolling() {
        int dice1 = diceRoll();
        int dice2 = diceRoll();
        int count = 1;
        while (!(dice1 == dice2)) {
            dice1 = diceRoll();
            dice2 = diceRoll();
            count = count + 1;
        }
        return count;
    }

    public static int countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + i * i;
        }
        return total;


    }

}
