
public class Primitives {

	public static void main(String[] args) {


		/**
		 * declaring some numeric data types
		 * note that int holds whole number values
		 * and double holds decimal values
		 */
		
		int myInt = 3;
		double myDbl = 3.55;
		
		System.out.println("myInt: " + myInt);
		System.out.println("myDbl: " + myDbl);
		
		/**
		 * now we can do the standard arithmetic operations
		 */
		
		myInt = 3 + 1; //4
		myDbl = 3.55 - .51; //3.04
		
		System.out.println("myInt: " + myInt);
		System.out.println("myDbl: " + myDbl);
		
		/**
		 * note that the order of operations is left to right, 
		 * multiplication/division first, then addition/subtraction
		 */
		
		myInt = 3 * 2 - 1; //5
		myDbl = 3.04 - 3.0 / 2.0; //1.54
		
		System.out.println("myInt: " + myInt);
		System.out.println("myDbl: " + myDbl);
		
		/**
		 * modulus example
		 */
		
		myInt = 5 % 3; //2, because 5 divided by 3 is 1, remainder 2
		myDbl = 1.54 % 1; //.54 because 1.54 divided by 1 is 1, remainder .54 
		
		System.out.println("myInt: " + myInt);
		System.out.println("myDbl: " + myDbl);
		
		/**
		 * operations inside parentheses take precedence over
		 * operations outside of parentheses
		 */
		
		myInt = 3 * (2 - 1); //3 because 2-1 is 1, and 3 * 1 is 3
		myDbl = (3.04 - 3.0) / 2.0; 
		/**
		 * .02 because 3.04 - 3 is .04.  And .04 / .02 is .02.
		 * disregard trailing values after 
		 * many zeroes for now, example: ...0000000000000018
		 */
		
		
		System.out.println("myInt: " + myInt);
		System.out.println("myDbl: " + myDbl);
		
		/**
		 * other ways to do arithmetic
		 */
		
		//take what is stored in myInt and add 5 to it
		myInt = myInt + 5; //8 because we already had a 3 there, and added 5
		System.out.println("myInt: " + myInt);
		
		//shorthand option
		myInt += 5; //13, because we had 8 there and added 5
		System.out.println("myInt: " + myInt);
		
		//quick increment or decrement by 1
		myInt++; //14, because we incremented 13 by one
		System.out.println("myInt: " + myInt);
		
		myInt--; //back to 13
		System.out.println("myInt: " + myInt);
		
		/**
		 * declare booleans
		 * show basic logic
		 */
		
		boolean myBool = true;
		boolean myBool2 = false;
		
		boolean myAnd = myBool && myBool2; //false
		boolean myOr = myBool || myBool2; //false
		boolean myNot = !myBool; //false

	}

}
