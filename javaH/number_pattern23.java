public class number_pattern23 {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}