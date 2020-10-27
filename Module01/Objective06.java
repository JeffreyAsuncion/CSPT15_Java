// Objective 06 - Use basic operators to interact with strings and lists

import java.util.ArrayList;


public class Objective06 {

    public static void main(String[] args) {
    
        /* 1. Assign two different types to variables "a" and "b".
	 * 2. Use basic operators to create a list that contains 
	 * three instances of "a" and three instances of "b"
	 */
	
	int a = 3;
	String b = "Lambda School";

	//  a

	ArrayList<Integer> a_list = new ArrayList<Integer>();
	System.out.println("Initial size: " + a_list.size());
	
	int i;
	for (i=1; i<4; i++) {
	    a_list.add(a);
	}
	System.out.println(a_list);


	ArrayList<String> b_list = new ArrayList<String>();
	System.out.println("Initial size: " + b_list.size());

	for (i=1; i<4; i++) {
	    b_list.add(b);
	}
	System.out.println(b_list);

    }
}
