import java.util.ArrayList;

public class Factors1 {
    public static void main(String[] args) {
        int n=20;
        fact(n);
    }
    static void fact(int n)
    {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n/i==i)
                {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);//quotient is stored in list in descending order
                }
            }

        }
        for(int i=list.size()-1;i>=0;i--) //to make the arraylist in ascending order
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
