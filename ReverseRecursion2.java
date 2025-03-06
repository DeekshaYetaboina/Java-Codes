public class ReverseRecursion2 {
    public static void main(String[] args) {
        System.out.println(rev(76543));
    }
    static int rev(int n)
    {
        int digit=(int)Math.log10(n)+1;
        return help(n,digit);
    }
    static int help(int n,int digit)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1))+help(n/10,digit-1);
    }
}
