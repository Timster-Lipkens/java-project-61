package hexlet.code;

public class Even {
    public static void game() {
        String name = Greet.name();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'."); //rule
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if ( !Common.check(Even.question(), Common.answer()) ) { //cycle
                check = false;
                break;
            }
        }
        Common.result(check, name);
    }
    public static String question() {
        int number = (int) (Math.random() * 100);
        System.out.println("Question: " + number);
        if (number % 2 == 0) return "yes";
        else return "no";
    }
}
