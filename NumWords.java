// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int num = 4517;
		int hundreds = (num % 1000) / 100;
		int tens = (num % 100) / 10;
		int ones = num % 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
