package hexlet.code.games;

import hexlet.code.Common;
import hexlet.code.Greet;

public class Prime {
    public static void game() {
        String name = Greet.name();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Common.check(Prime.question(), Common.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Common.result(check, name);
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
