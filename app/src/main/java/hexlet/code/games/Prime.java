package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] specific = new String[Engine.ROUNDS][2]; //rounds and question-solution
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Prime.principle(specific, i);
        }
        Engine.logic(rule, specific);
    }
    public static void principle(String[][] specific, int i) {
        final int number = (int) (Math.random() * Engine.RANDOM + 3); //conditional limit (not the first prime numbers)
        specific[i][0] = "" + number;
        specific[i][1] = (Prime.isPrime(number)) ? "yes" : "no";
    }
    public static boolean isPrime(int number) {
        var limit = Math.sqrt(number);
        int i2 = 2;
        while (i2 < limit) {
            if (number % i2 == 0) { //the number is not prime
                break;
            }
            i2++;
        }
        return !(i2 < limit); //true, if the number is prime
    }
}
