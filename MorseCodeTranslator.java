import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String args[]){
        String[] morse = 
                { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };
        
        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                  "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                  "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                  ",", ".", "?" };

        Scanner scanner = new Scanner(System.in);
        System.out.print("To translate: ");
        String toTranslate = scanner.nextLine();
        toTranslate = toTranslate.toLowerCase();
        char[] chars = toTranslate.toCharArray();

        for(int i = 0; i < chars.length; i++){
            
        }
        scanner.close();
    }
}