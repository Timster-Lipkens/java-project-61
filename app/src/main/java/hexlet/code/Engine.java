package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void logic(String[] specific) {
        System.out.println("Welcome to the Brain Games!"); //name
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(specific[0]); //rule
        boolean check = true;
        for (int i = 1; i < 3 * 2; i += 2) {
            System.out.print("Question: ");
            System.out.println(specific[i]);
            System.out.print("Your answer: ");
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            if (specific[i + 1].equals(answer)) System.out.println("Correct!");
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + specific[i + 1] + "'.");
                check = false;
                break;
            }
        }
        if (check) System.out.println("Congratulations, " + name + "!"); //result
        else System.out.println("Let's try again, " + name + "!");
    }
}
