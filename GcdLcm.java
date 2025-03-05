public class GcdLcm {
    public static void main(String[] args) {
        System.out.println(lcm(4,8));
    }
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return(gcd(a%b,a));
    }
    static int lcm(int a,int b)
    {
        return((a*b)/gcd(a,b));
    }
}
