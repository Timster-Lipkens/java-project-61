package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void game() {
        final String rule = "What number is missing in the progression?";
        String[][] specific = new String[Engine.ROUNDS][2]; //rounds and question-solution
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Progression.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number = (int) (Math.random() * 100 + 1); //conditional limit (natural numbers)
        final int numbers = (int) (Math.random() * 10 + 5); //randomization of progression
        final int step = (int) (Math.random() * 20 - 10); //the step is not only positive
        int secret = (int) (Math.random() * (numbers - 1) + 1); //the secret is inside
        for (int i2 = 0; i2 < Engine.ROUNDS; i2++) { //replacement null
            specific[i][0] = "";
            specific[i][1] = "";
        }
        specific[i][0] = Progression.expression(specific, i, number, numbers, step, secret);
    }
    public static String expression(String[][] specific, int i, int number, int numbers, int step, int secret) {
        StringBuilder expression = new StringBuilder();
        while (numbers > 0) {
            if (numbers == secret) {
                expression.append(".. ");
                specific[i][1] = "" + number; //Integer-
            } else {
                expression.append(number).append(" ");
            }
            number += step;
            numbers--;
        }
        return expression.toString();
    }
}
