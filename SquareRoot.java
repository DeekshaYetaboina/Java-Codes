public class SquareRoot {
    public static void main(String[] args) {
       // System.out.println((int)Math.sqrt(n));
        int n=40;
        int p=3;

        System.out.printf("%.3f",sqrt(n,p));
    }
     static double sqrt(int n,int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                root = mid;
                return mid;
            }
            if (mid * mid > end) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;

        }
        return root;
    }
}
