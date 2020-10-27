import java.util.ArrayList;

public class Objective05 {

    public static void main(String[] args) {
    
        /* 1. Create a "numbers" list that contains two different integer values
	 *  and two different floating point values.
	 *
	 * 2. Create a "strings" list that contains three different strings.
	 *
	 * 3. Print the 4th number of you numbers list and the 1st string of your strings list.
	 *
	 * 4. Iterate through your strings list and print each string.
	 */
	
	int[] numbers = new int[]{1, 2, 3, 4};

	System.out.println(numbers[3]);



	String[] words = new String[]{"good morning","bon jour", "ni hao"};

	int i;
	for (i=0; i<words.length; i++ ) {
	    System.out.println(words[i]);
	}
    }
}
