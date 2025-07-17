package hexlet.code;
import java.util.Scanner;

public class Common {
    // Logic: specific question, universal other.
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
}
