// Objective 04 - Basic types and Automatic and Manual Typecasting


public class Objective04 {

    public static void main(String[] args) {
    
        /* Modify the assignment statements below so that 
	 * an integer is assigned to "my_int",
	 * a floating point is assigned to "my_float",
	 * and a string is assigned to "my_string".
	 *
	 * Then, Use Typecasting to print your integer as floating point.
	 * Use typecasting again to print your floating point as integer.
	 */
        
        // Modify the code below to fulfill the requirements outlined in the docstring.
	int my_int = 10;
	double my_float = 3.14;
	String my_string = "I'm a String!";

	// Practice typecasting as outlined above with these print statements.
	double int_to_float = my_int; 	// Automatic casting: int to float
	int double_to_int = (int) my_float;  // Manual casting : float to int

	System.out.println("to float : " + int_to_float);
	System.out.println("  to int : " + double_to_int);
	System.out.println(" String  : " + my_string);


    }
}
