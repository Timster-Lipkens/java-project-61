package hexlet.code;

public class Randomizations {
    public static int generateNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
