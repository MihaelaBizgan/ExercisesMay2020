public class UdacityExercises {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        System.out.println("Roll1: " + roll1);
        System.out.println("Roll2: " + roll2);
//        boolean isLightGreen = false;
//        boolean isLightYellow = false;
//        if (isLightGreen){
//            System.out.println("Drive");
//        }else if(isLightYellow) {
//            System.out.println("Slow down.");
//        }else {
//            System.out.println("Stop.");
//        }
//
//        int ticketPrice = 10;
//        boolean isStudent = true;
//        int age = 10;
//            if (age < 15){
//                ticketPrice = 5;
//            }
//        System.out.println(ticketPrice);
//

//         if(passcode == 555){
//            coffeeType = "Espresso";
//         }else if(passcode == 312){
//             coffeeType = "vanilla coffee";
//         }else if(passcode == 333){
//             coffeeType = "Ristretto";
//         }else {
//             coffeeType = "Unknown";
//         }
//        System.out.println(coffeeType);

//
//        int passcode = 000;
//        String coffeeType;
//         switch (passcode){
//             case 555:
//                 coffeeType = "Espresso";
//                 break;
//             case 312:
//                 coffeeType = "vanilla coffee";
//                 break;
//             case 000:
//                 coffeeType = "Black";
//             default:
//                 coffeeType = "Unknown";
//             break;
//         }
//        System.out.println(coffeeType);

    }
    public static int rollDice(){
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }
}
