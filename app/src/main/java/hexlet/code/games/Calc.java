package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void game() {
        String name = Engine.name();
        System.out.println("What is the result of the expression?"); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Engine.check(Calc.question(), Engine.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Engine.result(check, name);
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
