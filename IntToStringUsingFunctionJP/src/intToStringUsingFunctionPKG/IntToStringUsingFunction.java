package intToStringUsingFunctionPKG;                // Pakage declared

import java.util.Scanner;                     // importing scanner utility

// This class will convert a Int type variable value to String type using String inbuilt function

public class IntToStringUsingFunction {                          // class declared and defined

	public static void main(String[] args) {                     // main method
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);            // creating a scanner object
		
		System.out.println("Enter a Integer Value : ");      // Printing info
		
		int intVar = input.nextInt();             // taking input value and assigning it to int type variable
		
		String strVar = String.valueOf(intVar);;             // converting an int variable value to string type using valueof()
		
		System.out.println();                               // printing a blank line
		System.out.println("String Representation of Integer Value "+intVar+" is : "+strVar); 

	}

}
