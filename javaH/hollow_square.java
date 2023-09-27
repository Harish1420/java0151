import java.util.Scanner;

public class hollow_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol you want to use: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Enter the number of rows/columns: ");
        int size = scanner.nextInt();

        // Print the top row
        for (int i = 1; i <= size; i++) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        // Print the middle rows
        for (int i = 2; i <= size - 1; i++) {
            System.out.print(symbol + " ");
            for (int j = 2; j <= size - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(symbol);
        }

        // Print the bottom row
        if (size > 1) {
            for (int i = 1; i <= size; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}