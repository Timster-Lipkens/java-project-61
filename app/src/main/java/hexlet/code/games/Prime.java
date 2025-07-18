package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        String name = Engine.name();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Engine.check(Prime.question(), Engine.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Engine.result(check, name);
    }
    public static String question() {
        int number = (int) (Math.random() * 100 + 3);
        System.out.println("Question: " + number);
        var limit = Math.sqrt(number);
        int i = 2;
        while (i < limit) {
             if (number % i == 0) break;
             i++;
        }
        if (i < limit) return "no";
        else return "yes";
    }
}
