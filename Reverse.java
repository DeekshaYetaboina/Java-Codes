import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        int answer=0;
        while(num>0)
        {
            int rem = num%10;

            answer=(answer*10)+rem;
            num = num/10;
        }
        System.out.println("The number in reversed format is:");
        System.out.println(answer);
    }
}
