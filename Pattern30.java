public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            for (int col = i; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= i; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
