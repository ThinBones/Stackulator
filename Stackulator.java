import java.util.*;

/**
 * Author: Jack Pender
 * Class:  APCSA
 * Date:   Feb 2025
 * Description: Adds numbers to a stack, uses an operator afterward
 * (postfix) to calculate the result
 */
public class Stackulator {
	private static StackList<Double> stack;
	private static String operator;
	
	public static void main(String[] args) {
		stack = new StackList<>();
		input();
		System.out.println(calculate());
	}

	/**
	 * Takes user input, either numbers or operators
	 */
	public static void input() {
		Scanner scan = new Scanner(System.in);
		boolean operatorGiven = false;
		int intResp;
		double doubleResp;

		while (!operatorGiven) {
			System.out.println("1. Number\n2. Operator");
			intResp = scan.nextInt();

			// the breaks break out of ONLY the switch
			switch (intResp) {
				case 1:
					System.out.println("Enter a number");
					doubleResp = scan.nextDouble();
					stack.push(doubleResp);
					break;
				case 2:
					System.out.println("Enter an operator");
					operator = scan.next();
					operatorGiven = true;
					break;
				default:
					System.out.println("Improper response");
					System.exit(0);
			}
		}

		scan.close();
	}

	/**
	 * Calculates based on the numbers and operators given
	 * @return
	 */
	public static double calculate() {
		double number2 = stack.pop();
		double number1 = stack.pop();

		// once again, breaks only out of the switch
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
			case "/":
				return number1 / number2;
            default:
                System.out.println("Not an operator");
				System.exit(0);
            }
		
		return Double.NaN;
	}
}