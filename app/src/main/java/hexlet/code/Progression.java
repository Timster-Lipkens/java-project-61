package hexlet.code;

public class Progression {
    public static void game() {
        String name = Greet.name();
        System.out.println("What number is missing in the progression?"); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Common.check(Progression.question(), Common.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Common.result(check, name);
    }
    public static String question() {
        int number = (int) (Math.random() * 100 + 1);
        int numbers = (int) (Math.random() * 10 + 5);
        int step = (int) (Math.random() * 20 - 10);
        int secret = (int) (Math.random() * (numbers - 1) + 1);
        System.out.print("Question:");
        while (numbers > 0) {
            if (numbers == secret) {
                System.out.print(" ..");
                secret = number;
            }
            else System.out.print(" " + number);
            number += step;
            numbers--;
        }
        System.out.println();
        return "" + secret;
    }
}
