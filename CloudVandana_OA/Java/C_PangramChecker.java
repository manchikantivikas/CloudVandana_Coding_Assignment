import java.util.Scanner;

public class C_PangramChecker {

    public static boolean isPangram(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        
        boolean[] alphabet = new boolean[26];
        int index = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }
            else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            else {
                continue;
            }
            
            alphabet[index] = true;
        }
        
        for (int i = 0; i <= 25; i++) {
            if (alphabet[i] == false) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a pangram:");
        String userInput = scanner.nextLine();
        
        System.out.println(isPangram(userInput) ? "The string is a pangram" : "The string is not a pangram");
    }
}
