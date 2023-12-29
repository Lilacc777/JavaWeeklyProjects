import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String args[]){
        String[] morse = 
                { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|"};
        
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("To translate: ");
        String toTranslate = scanner.nextLine();
        toTranslate = toTranslate.toLowerCase();
        String[] list = toTranslate.split(" ");
        
        String answer = "";
        for(int x = 0; x < list.length; x++){
            for(int i = 0; i < list[x].length(); i++){
                for(int j = 0; j < english.length; j++){
                    if(list[x].charAt(i) == english[j]){
                        answer = answer + morse[j] + " ";
                    }
                }
            }
            if(list[x] == list[list.length - 1]){
                break;
            }
            answer += "/ ";
        }
        System.out.println("Translated: " + answer);
        scanner.close();
    }
}