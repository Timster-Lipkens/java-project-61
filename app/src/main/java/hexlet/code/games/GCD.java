package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void game() {
        String[] specific = new String[1 + 3 * 2];
        specific[0] = "Find the greatest common divisor of given numbers."; //rule
        for (int i = 1; i < 3 * 2; i += 2) GCD.principle(specific, i);
        Engine.logic(specific);
    }
    public static void principle(String[] specific, int i) {
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100);
        specific[i] = number1 + " " + number2;
        int Euclid; //1
        while (number2 > 0) {
            Euclid = number1 % number2;
            number1 = number2;
            number2 = Euclid;
        }
        specific[i + 1] = "" + number1;
    }
}
