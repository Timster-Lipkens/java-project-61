package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        final String rule = "What is the result of the expression?";
        String[][] specific = new String[3][2];
        for (int i = 0; i < 3; i++) {
            Calc.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number1 = (int) (Math.random() * 100);
        int operation1 = (int) (Math.random() * 3); //0, 1, 2
        int number2 = (int) (Math.random() * 100);
        Calc.expression(specific, i, number1, operation1, number2);
    }
    public static void expression(String[][] specific, int i, int number1, int operation1, int number2) {
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
        specific[i][0] = number1 + " " + operation2 + " " + number2; //question
        specific[i][1] = "" + result; //solution
    }
}
