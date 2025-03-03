public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
        static void pattern( int n)
        {
            for (int i = 0; i < 2*n; i++) {
                int countofcols = i > n ? (2 * n) - i : i;
                for (int j = 0; j < countofcols; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}
