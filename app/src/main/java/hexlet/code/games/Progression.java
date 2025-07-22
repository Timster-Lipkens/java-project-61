package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        final String RULE = "What number is missing in the progression?";
        String[][] specific = new String[3][2];
        for (int i = 0; i < 3; i++) Progression.principle(specific, i);
        Engine.logic(RULE, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number = (int) (Math.random() * 100 + 1);
        int numbers = (int) (Math.random() * 10 + 5);
        int step = (int) (Math.random() * 20 - 10);
        int secret = (int) (Math.random() * (numbers - 1) + 1);
        for (int i2 = 0; i2 < 3; i2++) { //null
            specific[i][0] = "";
            specific[i][1] = "";
        }
        Progression.secret(specific, i, number, numbers, step, secret);
    }
    public static void secret(String[][] specific, int i, int number, int numbers, int step, int secret) {
        while (numbers > 0) {
            if (numbers == secret) {
                specific[i][0] += ".. ";
                secret = number;
            }
            else specific[i][0] += number + " ";
            number += step;
            numbers--;
        }
        specific[i][1] = "" + secret;
    }
}
