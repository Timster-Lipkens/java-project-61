package hexlet.code;
import java.util.Scanner;

public class Engine { // Common.
    public static String name() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static String answer() {
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine(); // String answer = scanner.nextLine();
    }
    public static boolean check(String question, String answer) {
        if (question.equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + question + "'.");
            return false;
        }
    }
    public static void result(boolean check, String name) {
        if (check) System.out.println("Congratulations, " + name + "!");
        else System.out.println("Let's try again, " + name + "!");
    }
} // Logic: specific question, universal other.
