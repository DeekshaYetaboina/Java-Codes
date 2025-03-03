public class Pattern31 {
    public static void main(String[] args) {
        int orgn=4;
       int n=2*orgn;

        for(int i=1;i<n;i++)
        {

            for(int j=1;j<n;j++)
            {
                int foreachindex = orgn - (Math.min(Math.min(i,j),Math.min(n-i,n-j)))+1;
                System.out.print(foreachindex + " ");
            }
            System.out.println();
        }
    }
}
