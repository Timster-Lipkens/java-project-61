package hexlet.code.games;

import hexlet.code.Common;
import hexlet.code.Greet;

public class GCD {
    public static void game() {
        String name = Greet.name();
        System.out.println("Find the greatest common divisor of given numbers."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Common.check(GCD.question(), Common.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Common.result(check, name);
    }
    public static String question() {
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        System.out.println("Question: " + number1 + " " + number2);
        int Euclid = 0;
        while (number2 > 0) {
            Euclid = number1 % number2;
            number1 = number2;
            number2 = Euclid;
        }
        return "" + number1;
    }
}
