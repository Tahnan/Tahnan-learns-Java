public class Four {
    /*
     * Largest palindromic product of two n-digit numbers
     */
    public static int largest_palindromic(int digits) {
	int highest = (int) Math.pow(10, digits) - 1;
	int lowest = (int) Math.pow(10, digits - 1);
	int best_seen = 0;
	for (int first = highest; first > lowest; first--) {
	    if (first * first < best_seen)
		break;
	    for (int second = first; second > lowest; second--) {
		int product = first * second;
		if (product < best_seen)
		    break;
		String productString = Integer.toString(product);
		String reversed = new StringBuilder(productString).reverse().toString();
		if (productString.equals(reversed))
		    best_seen = product;
	    }
	};
	return best_seen;

    };

    public static void main(String[] args) {
	int digits = Integer.parseInt(args[0]);
	int result = largest_palindromic(digits);
	System.out.println(result);
    }
}
