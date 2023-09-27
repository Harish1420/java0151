import java.util.Scanner;
public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username.");
        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() >= 5 && username.matches("[a-zA-Z0-9]+")) {
            return true;
        } else {
            return false;
        }
    }
}
