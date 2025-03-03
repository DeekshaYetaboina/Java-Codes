public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        int last;
        int base=5;
        int ans=0;

        while(n>0)
        {
            last=n&1;
            ans+=last*base;
            base=base*5;
            n= n>>1;
        }
        System.out.println(ans);
    }
}
