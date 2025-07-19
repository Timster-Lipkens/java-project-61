package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void game() {
        String name = Engine.name();
        System.out.println("Find the greatest common divisor of given numbers."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Engine.check(GCD.question(), Engine.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Engine.result(check, name);
    }
    public static String question() {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        System.out.println("Question: " + number1 + " " + number2);
        int Euclid; //0
        while (number2 > 0) {
            Euclid = number1 % number2;
            number1 = number2;
            number2 = Euclid;
        }
        return "" + number1;
    }
}
