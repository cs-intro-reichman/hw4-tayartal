public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;
        int p = 2 ; 
        int times = 0;
        //int precent;
        System.out.println("Prime numbers up to " + n + ":");
        while (p < Math.sqrt(n)) {
            if (isPrime[p]) {
                //System.out.println(p);
                //times++;
                int j = p * p;
                while (j <= n) {
                    isPrime[j] = false;
                    j += p;
                } 
            }
            p++;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                times++;
            }
        }
        System.out.println(); // Newline after listing primes

        // Calculate percentage of primes
        int percent = (int)(((double) times / n) * 100);
        //precent = ((2/n) * 100);
                //There are 10 primes between 2 and 30 (33% are primes)
        System.out.println("There are " + times + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
}