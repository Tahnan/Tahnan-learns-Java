public class Anagram {
    private static void lettersIntoArray(String word, int[] counter, boolean addLetters) {
	// if we're adding a word, we'll add 1 to each element of the counter;
	// otherwise, we'll subtract 1 from each element
	int factor = addLetters ? 1 : -1;
	
	// For each char in word: if it's an ASCII letter, i.e. if its codepoint
	// is between 65 and 90, update the corresponding point in the counter
	for (char codepoint : word.toCharArray()) {
	    if (65 <= codepoint && codepoint <= 90) {
	        counter[codepoint - 65] += factor;
	    }
	}
    }


    // convenience methods for adding/removing a word
    public static void addWordToArray(String word, int[] counter) {
	lettersIntoArray(word, counter, true);
    }

    public static void subtractWordFromArray(String word, int[] counter) {
	lettersIntoArray(word, counter, false);
    }

    public static void main(String[] args) {
	// If there are more than two words/phrases, bail out
	if (args.length != 2) {
	    System.out.println("Wrong number of args!");
	    return;
	}

	// Put the first and second words into variables, for ease of reference;
	// initialize an array of 0s, one for each letter in the alphabet
	String first = args[0].toUpperCase();
	String second = args[1].toUpperCase();
	int[] letters = new int[26];

	addWordToArray(first, letters);
	subtractWordFromArray(second, letters);

	// If anything in the array isn't 0, there's an imbalance.  Otherwise, yay!
	for (int letterCount: letters) {
	    if (letterCount !=0) {
		System.out.println("Not an anagram.");
		return;
	    }
	}
	System.out.println("Anagram!");
	    
    }
}
