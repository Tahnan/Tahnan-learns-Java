public class One {
    public static void main(String[] args) {
	/**
	 * Takes a number; returns sum of multiples of 3 or 5 less than number
	 * Parametrized to allow testing with number = 10
	 **/
	int number = Integer.parseInt(args[0]);
	int total = 0;
	for (int i = 0; i<number; i++) {
	    if (i % 3 == 0 || i % 5 == 0)
		total += i;
	};
	System.out.println(total);
    }
}
