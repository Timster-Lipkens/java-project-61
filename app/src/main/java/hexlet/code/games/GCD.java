package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void game() {
        final String RULE = "Find the greatest common divisor of given numbers.";
        String[][] specific = new String[3][2];
        for (int i = 0; i < 3; i++) GCD.principle(specific, i);
        Engine.logic(RULE, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100);
        specific[i][0] = number1 + " " + number2;
        specific[i][1] = "" + GCD.Euclid(number1, number2);
    }
    public static int Euclid(int number1, int number2) {
        int Euclid; //1
        while (number2 > 0) {
            Euclid = number1 % number2;
            number1 = number2;
            number2 = Euclid;
        }
        return number1;
    }
}
