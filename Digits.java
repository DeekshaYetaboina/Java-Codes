public class Digits {
    public static void main(String[] args) {
        //fun(5);       // descending order
        funrev(5);    // ascending order
    }
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    static void funrev(int n)
    {
        if (n==0)
        {
            return;
        }
        funrev(n-1);
        System.out.print(n +" ");
    }
}
