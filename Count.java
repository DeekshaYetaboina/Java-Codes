import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit");
        int num = in.nextInt();
        System.out.println("Enter the repeated digit");
        int digit = in.nextInt();
        int count = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem == digit)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println("the digit is repeated:");
        System.out.println(count);
    }
}
