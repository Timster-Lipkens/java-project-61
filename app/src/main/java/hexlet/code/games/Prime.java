package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        String[] specific = new String[1 + 3 * 2];
        specific[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'."; //rule
        for (int i = 1; i < 3 * 2; i += 2) Prime.principle(specific, i);
        Engine.logic(specific);
    }
    public static void principle(String[] specific, int i) {
        int number = (int) (Math.random() * 100 + 3);
        specific[i] = "" + number;
        var limit = Math.sqrt(number);
        int i2 = 2;
        while (i2 < limit) {
             if (number % i2 == 0) break;
             i2++;
        }
        if (i2 < limit) specific[i + 1] = "no";
        else specific[i + 1] = "yes";
    }
}
