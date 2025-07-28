package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int RANDOM = 100;

    public static void logic(String rule, String[][] specific) {
        System.out.println("Welcome to the Brain Games!"); //name
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println(rule); //body
        boolean check = true;
        for (int i = 0; i < ROUNDS; i++) {
            System.out.print("Question: ");
            System.out.println(specific[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            if (specific[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + specific[i][1] + "'.");
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Congratulations, " + name + "!"); //result
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
