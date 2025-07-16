package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            boolean even = ((number % 2) == 0);  //int even = number % 2;
            System.out.print("Your answer: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if ( (even & answer.equals("yes")) | (!even & answer.equals("no")) ) System.out.println("Correct!");
            else {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was ");
                if (even) System.out.println("'yes'.");
                else System.out.println("'no'.");
                check = false;
                break;
            }
        }
        if (check) System.out.println("Congratulations, " + name + "!");
        else System.out.println("Let's try again, " + name + "!");
    }
}