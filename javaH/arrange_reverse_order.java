import java.util.Arrays;
import java.util.Scanner;
public class arrange_reverse_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        scanner.close();
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        for (int i = 0, j = letters.length - 1; i < j; i++, j--) {
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        System.out.print("Alphabetical Order: ");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}