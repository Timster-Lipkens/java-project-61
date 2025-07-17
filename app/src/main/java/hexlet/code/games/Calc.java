package hexlet.code.games;

import hexlet.code.Common;
import hexlet.code.Greet;

public class Calc {
    public static void game() {
        String name = Greet.name();
        System.out.println("What is the result of the expression?"); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Common.check(Calc.question(), Common.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Common.result(check, name);
    }
    public static String question() {
        int number1 = (int) (Math.random() * 100);
        int operation1 = (int) (Math.random() * 3); //0, 1, 2
        int number2 = (int) (Math.random() * 100);
        char operation2 = '+'; //String?
        int result = number1 + number2;
        switch(operation1) {
            case 1:
                operation2 = '-';
                result = number1 - number2;
                break;
            case 2:
                operation2 = '*';
                result = number1 * number2;
                break;
        }
        System.out.println("Question: " + number1 + " " + operation2 + " " + number2);
        return "" + result;
    }
}
