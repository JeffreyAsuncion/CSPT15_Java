// Objective 09 - Evaluate conditional expressions and use boolean operators to control flow
// Change the assignment statements below so that all of the print functions call print True


public class Objective09 {

    public static void main(String[] args) {
    
        // change these values so that all of the print statements print True
	int number = 20;
	int second_number = 0;
	int[] first_list = {1, 1, 1};
	int[] second_list = {1, 2};
	// only change the code above this line

	// all of these print statements must print True by only changing the assignment statements above
	System.out.println(number > 15);
	System.out.println(first_list);
	System.out.println((second_list.length)==2);
	System.out.println(first_list.length+second_list.length == 5);
	//System.out.println((first_list & first_list[0]) == 1);
	System.out.println(!((boolean)second_number));
	
    }
}
