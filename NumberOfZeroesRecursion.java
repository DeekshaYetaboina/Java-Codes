public class NumberOfZeroesRecursion {
    public static void main(String[] args) {
        System.out.println(count(30890));
    }
    static int count(int n) {
        return number(n, 0);
    }
    static int number(int n,int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10==0)
        {
            return number(n/10,count+1);
        }
        return number(n/10,count);

    }
}
