import java.util.Scanner;
public class removing_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String stringWithoutVowels = removeVowels(inputString);
        System.out.println("The string without vowels is: " + stringWithoutVowels);
    }
    public static String removeVowels(String inputString) {
        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}