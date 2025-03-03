public class Pattern28 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n;i++)
        {
            int totalcols=i>n?2*n-i:i;

            int spaces=n-totalcols;
            for(int s=0;s<spaces;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<totalcols;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
