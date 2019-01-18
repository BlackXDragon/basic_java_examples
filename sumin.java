import java.util.Scanner; // To take input

public class sumin {
	// Print sum of two numbers taken as input
	// Example syntax:
	// java sumin
	// 1 3
	// 4		<output>
	//
	// Another syntax:
	// java sumin
	// 1
	// 3
	// 4		<output>
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in); // Scanner object which is used to read input. System.in is the input stream of the console
		System.out.print(in.nextInt()+in.nextInt()); // Print the sum of the two numbers. in.nextInt() reads a number.
	}
}