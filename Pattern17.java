public class Pattern17 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=2*n;i++)
        {
            int totalcount=i>n?2*n-i:i;
            for(int space=0;space<=n-totalcount;space++)
            {
                System.out.print(" ");
            }

            for(int col=totalcount;col>=1;col--)
            {
                System.out.print(col);
            }
            for(int col=2;col<=totalcount;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
