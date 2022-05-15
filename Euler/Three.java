public class Three {
    /*
     * Largest prime factor of a number
     */

    public static long get_smallest_prime_factor(long n) {
	if (n % 2 == 0)
	    return 2;
	for (long i = 3; i < n; i += 2) {
	    if (n % i == 0)
		return i;
	};
	return n;
    };
    
    public static void main(String[] args) {
	long number = Long.parseLong(args[0]);
	while (true) {
	    long prime = get_smallest_prime_factor(number);
	    if (prime == number) {
		System.out.println(number);
		return;
	    }
	    number /= prime;
	}
    }
}
