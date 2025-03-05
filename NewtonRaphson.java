public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.printf("%.2f",sqrt(40));
    }
    static double sqrt(int n)
    {
        double x=n;
        double root;
        while(true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) { //0.5 is just the precision u can adjust the precision value
                break;
            }
            x=root; //update root
        }
        return root;
    }
}
