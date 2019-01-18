public class sum {
	// Prints sum of command line arguments
	// Syntax:
	// java sum num1 num2
	// Example:
	// java sum 10 20
	public static void main(String args[]) { // args[] array contains the command line arguments as strings.
		System.out.print(Integer.parseInt(args[0])+Integer.parseInt(args[1])); // Printing the sum after parsing the strings into integers
	}
}