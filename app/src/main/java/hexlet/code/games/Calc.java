package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        String[] specific = new String[1 + 3 * 2];
        specific[0] = "What is the result of the expression?"; //rule
        for (int i = 1; i < 3 * 2; i += 2) Calc.principle(specific, i);
        Engine.logic(specific);
    }
    public static void principle(String[] specific, int i) {
        int number1 = (int) (Math.random() * 100);
        int operation1 = (int) (Math.random() * 3); //0, 1, 2
        int number2 = (int) (Math.random() * 100);
        char operation2 = '+';
        int result = number1 + number2;
        if (operation1 == 1) { //switch
            operation2 = '-';
            result = number1 - number2;
        }
        if (operation1 == 2) {
            operation2 = '*';
            result = number1 * number2;
        }
        specific[i] = number1 + " " + operation2 + " " + number2; //question
        specific[i + 1] = "" + result; //solution
    }
}
