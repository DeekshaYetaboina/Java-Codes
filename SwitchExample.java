import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        String name = in.next();
        int no = in.nextInt();
        switch (name) {
            case "deeksha":
                System.out.println("my name is deeksha");
                break;
            case "july":
                System.out.println("my name is july");
                break;
            case "mary":
                switch (no) {
                    case 1:
                        System.out.println("mary 1");
                        break;
                    case 2:
                        System.out.println("mary 2");
                        break;
                    case 3:
                        System.out.println("mary 3");
                        break;
                    default:
                        System.out.println("enter crt number");
                        break;
                }
                break;
            default:
                System.out.println("enter correct name");
                break;
        }
    }
}
