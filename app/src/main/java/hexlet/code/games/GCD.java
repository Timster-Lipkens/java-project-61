package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizations;

public class GCD {
    public static void game() {
        final String rule = "Find the greatest common divisor of given numbers.";
        String[][] specific = new String[Engine.ROUNDS][2]; //rounds and question-solution
        for (int i = 0; i < Engine.ROUNDS; i++) {
            GCD.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number1 = Randomizations.generateNumber(1, Engine.RANDOM); //zero divided by zero is indefinitely
        int number2 = Randomizations.generateNumber(0, Engine.RANDOM); //conditional limit
        specific[i][0] = number1 + " " + number2;
        specific[i][1] = "" + GCD.euclid(number1, number2);
    }
    public static int euclid(int number1, int number2) {
        int euclid; //1
        while (number2 > 0) {
            euclid = number1 % number2;
            number1 = number2;
            number2 = euclid;
        }
        return number1;
    }
}
