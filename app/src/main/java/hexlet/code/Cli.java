package hexlet.code;
import java.util.Scanner;

public class Cli { //Greet
    public static void name() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + scanner.nextLine() + "!");
    }
}
