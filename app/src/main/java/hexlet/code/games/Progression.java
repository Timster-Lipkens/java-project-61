package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizations;

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
        int number = Randomizations.generateNumber(1, Engine.RANDOM); //conditional limit (natural numbers)
        final int step = Randomizations.generateNumber(-10, 10); //the step is not only positive
        final int numbers = Randomizations.generateNumber(5, 15); //randomization of progression
        int secret = Randomizations.generateNumber(0, numbers - 1); //the secret is inside

        String[] progression = Progression.makeProgression(number, step, numbers); //full
        specific[i][1] = progression[secret];
        progression[secret] = ".."; //we hide the secret
        specific[i][0] = String.join(" ", progression);
    }
    public static String[] makeProgression(int number, int step, int numbers) {
        String[] result = new String[numbers];
        result[0] = "" + number;
        for (int i = 1; i < numbers; i++) {
            number += step;
            result[i] = "" + number;
        }
        return result;
    }
}
