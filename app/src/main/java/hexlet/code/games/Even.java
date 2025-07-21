package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void game() {
        String[] specific = new String[1 + 3 * 2];
        specific[0] = "Answer 'yes' if the number is even, otherwise answer 'no'."; //rule
        for (int i = 1; i < 3 * 2; i += 2) Even.principle(specific, i);
        Engine.logic(specific);
    }
    public static void principle(String[] specific, int i) {
        int number = (int) (Math.random() * 100);
        specific[i] = "" + number; //question
        if (number % 2 == 0) specific[i + 1] = "yes"; //solution
        else specific[i + 1] = "no";
    }
}
