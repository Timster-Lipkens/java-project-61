package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomizations;

public class Calc {
    public static void game() {
        final String rule = "What is the result of the expression?";
        String[][] specific = new String[Engine.ROUNDS][2]; //rounds and question-solution
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Calc.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        int number1 = Randomizations.generateNumber(0, Engine.RANDOM); //conditional limit
        final char[] operations = {'+', '-', '*', '+'}; //fourth option for improbably Math.random() == 1
        final char operation = operations[Randomizations.generateNumber(0, 2 + 1)]; //three options are equiprobable
        int number2 = Randomizations.generateNumber(0, Engine.RANDOM);
        specific[i][0] = number1 + " " + operation + " " + number2;
        specific[i][1] = "" + Calc.calculate(number1, operation, number2);
    }
    public static int calculate(int number1, char operation, int number2) {
        switch (operation) { //Can ->
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("The programmer made a mistake with randomization: " + operation);
        }
    }
}
