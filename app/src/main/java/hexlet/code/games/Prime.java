package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        final String rule = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        String[][] specific = new String[3][2];
        for (int i = 0; i < 3; i++) {
            Prime.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number = (int) (Math.random() * 100 + 3);
        specific[i][0] = "" + number;
        specific[i][1] = Prime.check(number);
    }
    public static String check(int number) {
        var limit = Math.sqrt(number);
        int i2 = 2;
        while (i2 < limit) {
            if (number % i2 == 0) {
                break;
            }
            i2++;
        }
        if (i2 < limit) {
            return "no";
        } else {
            return "yes";
        }
    }
}
