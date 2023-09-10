import java.util.Scanner;
import java.util.Random;

public class GuesstheNumberChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randInt = rand.nextInt(100);
        boolean isGuessing = true;

        System.out.println("I am thinking of a number between 1 and 100.");
        System.out.println("Guess the number:");

        while (isGuessing) {
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess > randInt) {
                System.out.println("too high");
            }
            if (guess < randInt) {
                System.out.println("too low");
            }
            if (guess == randInt) {
                System.out.println("correct");
                isGuessing = false;
            }
        }
    }
}
