package hexlet.code;
import java.util.Scanner;

public class Greet {
    public static String name() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
