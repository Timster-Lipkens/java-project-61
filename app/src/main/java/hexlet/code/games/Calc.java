package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        final String rule = "What is the result of the expression?";
        String[][] specific = new String[3][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Calc.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number1 = (int) (Math.random() * 100); //conditional limit
        int operation1 = (int) (Math.random() * 3); //0, 1, 2 (three possible operations)
        int number2 = (int) (Math.random() * 100);
        specific[i][0] = Calc.expression(number1, operation1, number2); //question
        specific[i][1] = Calc.result(number1, operation1, number2); //solution
    }
    public static String expression(int number1, int operation1, int number2) {
        char operation2 = '+';
        if (operation1 == 1) { //switch
            operation2 = '-';
        }
        if (operation1 == 2) {
            operation2 = '*';
        }
        return number1 + " " + operation2 + " " + number2; //question
    }
    public static String result(int number1, int operation1, int number2) {
        int result = number1 + number2;
        if (operation1 == 1) { //switch
            result = number1 - number2;
        }
        if (operation1 == 2) {
            result = number1 * number2;
        }
        return "" + result; //solution
    }
}
