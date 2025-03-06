public class Decrement {
    public static void main(String[] args) {
        example(5);
    }
    static void example(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        example(--n); /*if we run (n--) we get infinite loop because first it prints the value then decrement
         the value.And there  is no chance for decrementing and hence it keeps on printing the number entered.*/
    }
}
