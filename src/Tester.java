/**
 * @author Tommaso
 * Class to test other classes
 */
public class Tester {
	public static void main(String[] args) {
		ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
		System.out.println(arithmeticOperators.sum(10,2));
		System.out.println(arithmeticOperators.sub(10,2));
		System.out.println(arithmeticOperators.mul(10,2));
		System.out.println(arithmeticOperators.div(10,2));
	}
}