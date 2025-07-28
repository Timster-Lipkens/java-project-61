package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizations;

public class Even {
    public static void game() {
        final String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] specific = new String[Engine.ROUNDS][2]; //rounds and question-solution
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Even.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number = Randomizations.generateNumber(0, Engine.RANDOM); //conditional limit
        specific[i][0] = "" + number; //question
        specific[i][1] = (number % 2 == 0) ? "yes" : "no"; //solution
    }
}
