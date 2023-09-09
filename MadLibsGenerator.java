import java.util.Scanner;

public class MadLibsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's fill in a Mad Libs together!");
        System.out.println("Write a noun:");
        String noun1 = scanner.nextLine();
        System.out.println("Write a different noun:");
        String noun2 = scanner.nextLine();
        System.out.println("Write another unique noun- this time a clothing piece:");
        String noun3 = scanner.nextLine();
       
        System.out.println("Write an adjective:");
        String adjective1 = scanner.nextLine();
        System.out.println("Write a different adjective:");
        String adjective2 = scanner.nextLine();
        System.out.println("Write another unique adjective:");
        String adjective3 = scanner.nextLine();

        System.out.println("Write a present-tense verb:");
        String verb1 = scanner.nextLine();
        System.out.println("Write a different present-tense verb:");
        String verb2 = scanner.nextLine();
        System.out.println("Write another verb- this time one in the past-tense");
        String verb3 = scanner.nextLine();

        System.out.println("Thanks! Now let's plug the words you generated into the story!");
        System.out.println("Once upon a time, there was a " + noun1 + " that loved to " + verb1 + " under the " + adjective1 + " sun.");
        System.out.println("It spotted a " + adjective2 + " " + noun2 + " that was trying to " + verb2 + ".");
        System.out.println("The " + noun2 + " seemed to be wearing a " + noun3 + ".");
        System.out.println("When the " + noun1 + " caught up, it noticed that it was all a " + adjective3 + " dream.");
        System.out.println("Then, the " + noun1 + " " + verb3 + " and told its friends.");
        System.out.println("The end.");
    }
}