package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        String[] specific = new String[1 + 3 * 2];
        specific[0] = "What number is missing in the progression?"; //rule
        for (int i = 1; i < 3 * 2; i += 2) Progression.principle(specific, i);
        Engine.logic(specific);
    }
    public static void principle(String[] specific, int i) {
        int number = (int) (Math.random() * 100 + 1);
        int numbers = (int) (Math.random() * 10 + 5);
        int step = (int) (Math.random() * 20 - 10);
        int secret = (int) (Math.random() * (numbers - 1) + 1);
        for (int i2 = 0; i2 < 3 * 2; i2++) specific[i] = ""; //null
        while (numbers > 0) {
            if (numbers == secret) {
                specific[i] += ".. ";
                secret = number;
            }
            else specific[i] += number + " ";
            number += step;
            numbers--;
        }
        specific[i + 1] = "" + secret;
    }
}
