/**
 * Take two positive numbers as strings, and return the sum of them.
 * Result must not be able to convert strings to numbers, add them, and then
 * return back a string. 
 * 
 * @author joshventocilla
 */
public class SumOfTwoNumbers {
	
	public String sumOfStrings(String string1, String string2) {
		
		// Check to see if string1 is larger than string2, if so swap the length
		// of string1 with string2 to make it larger
		if(string1.length() > string2.length()) {
			String swp = string1;
			string1 = string2;
			string2 = swp;
		}
		
		// Declare empty result to store 
		String result = "";
		
		// Reverse the string
		string1 = new StringBuilder(string1).reverse().toString();
		string2 = new StringBuilder(string2).reverse().toString();
		
		// Calculate the length of each string for summing purposes
		int numString1 = string1.length();
		int numString2 = string2.length();
		
		int carry = 0;
		
		// Iterate through the string to compute the sum of the numbers
		for(int i=0; i<numString1; i++) {
			
			// compute the sum of current digits
			int sum = ( (string1.charAt(i) - '0') + 	//ASCII numbers to subtract '0' from
					    (string2.charAt(i) - '0') + 
					     carry );
			result += (char)(sum % 10 + '0');		
			carry = sum/10;								// compute carry for the next digit
		}
		
		for(int j=numString1; j<numString2; j++) {
			
			// compute the rest of the numbers
			int sum=( (string2.charAt(j) - '0') +
					  carry );
			result += (char)(sum % 10 + '0');
			carry = sum/10;
		}
		
		// Add carry
		if(carry > 0) {
			result += (char)(carry + '0');
		}
		
		// Reverse result 
		result = new StringBuilder(result).reverse().toString();

		return result;
	}

}
