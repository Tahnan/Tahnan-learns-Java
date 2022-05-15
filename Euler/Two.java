public class Two {
    /*
     * Sum the even-valued terms of Fibonacci numbers under four million.
     */
    
    public static void main(String[] args) {
	int a = 1;
	int b = 1;
	int new_b = 0;
	int total = 0;
	while (b < 4000000) {
	    new_b = a + b;
	    a = b;
	    b = new_b;
	    if (b % 2 == 0)
		total += b;
	};
	System.out.println(total);
    }
}
