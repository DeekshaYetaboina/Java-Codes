public class SeiveEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        System.out.println(primes[0]);
        prime(n, primes);
    }

    private static void prime(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

