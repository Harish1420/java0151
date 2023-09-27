import java.util.Scanner;

public class uh{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        
        int specialCharCount = 0;
        
        System.out.println("Special characters in the line:");

        for (int i = 0; i < inputLine.length(); i++) {
            char ch = inputLine.charAt(i);
            
            if (isSpecialCharacter(ch)) {
                specialCharCount++;
                System.out.print(ch + " ");
            }
        }
        
        System.out.println("\nNumber of special characters: " + specialCharCount);
    }

    public static boolean isSpecialCharacter(char ch) {
  
        return !Character.isLetterOrDigit(ch);
    }
}
