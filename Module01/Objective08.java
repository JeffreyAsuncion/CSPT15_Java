// Objective 08 - Perform basic string operations


public class Objective08 {

    public static void main(String[] args) {
    
        /* Modify the "mystery_string" below until all of the print statements
	 * print as expected based on the comments above each print call
	 */
	//String mystery_string = "Your task is to discover what this string should be."; // original
	//String mystery_string = "                                                ";     // clue 1
	//String mystery_string = "     k                                          ";     // clue 2
	//String mystery_string = "     k                                          ";     // clue 3
	//String mystery_string = "     k    potential                             ";      // clue 4
	//String mystery_string = "     k    potential regardless                 ";      // clue 5
	//String mystery_string = "     k    potential regardless                 ";      // clue 6
	//String mystery_string = "Unlocki g potential regardless o   i c m t n e ";      // clue 7 
	String mystery_string = "Unlocki g potential regardless o   i c mstance.";      // clue 8 


	// below are the clues that we are using to re-evaluate the mystery_string
	


	// clue 1: Should print out 48
	// python : print(len(mystery_string))
	System.out.println(mystery_string.length()); // now we know that this should be 48
	
	// clue 2: Should print out 5
	// python : print(mystery_string.index("k"))
	System.out.println(mystery_string.indexOf("k"));

	// clue 3: Should print out 4
	// python : print(mystery_string.count("c"))
	// System.out.println();
	
	// clue 4: Should print out "potential"
	// python : print(mystery_string[10:19])
	System.out.println(mystery_string.substring(10,19));

	// clue 5: Should print out "sseldrager"
	// python : print(mystery_string[30:20:-1])		
	String source = mystery_string.substring(20,30);
	String rev_string = reverse(source);
	System.out.println(rev_string);

	// clue 6: Should print out "Ulcigptnil eadeso icmtne"
	// python : print(mystery_string[::2])
	// ???????
	
	// clue 7: Shoulde print out True
	// python : print(mystery_string.startswith("Unlo"))
        System.out.println(mystery_string.startsWith("Unlo", 0));

	// clue 8: Should print out True
	// python : print(mystery_string.endswith("stance."))
	System.out.println(mystery_string.endsWith("stance."));

	// clue 9: Should print out 5
	// python : print(mystery_string.split())
	String split_list = mystery_string.split();
	int split_count;
        split_count = split_list.length();
	System.out.println(split_count);
    }


    // function to reverse the slice of the string
    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
		return source;
	} 
	String reverse = "";
	for (int i = source.length()-1; i >= 0; i--) {
		reverse = reverse + source.charAt(i);
	}
	return reverse;
    }
}
