public class NoOfBits {
//else use formula int ans = (int)(Math.log(n)/Math.log(b))+1; where n is the number and b is the base
    public static void main(String[] args) {
        int last;
        int count=0;
        int n=16;
        while(n>0)
        {
            last=n&1;
            n=n>>1;
            count+=1;
        }
        System.out.println(count);
    }
}
