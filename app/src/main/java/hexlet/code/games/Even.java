package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void game() {
        String name = Engine.name();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Engine.check(Even.question(), Engine.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Engine.result(check, name);
    }
    public static String question() {
        int number = (int) (Math.random() * 100);
        System.out.println("Question: " + number);
        if (number % 2 == 0) return "yes";
        else return "no";
    }
}
