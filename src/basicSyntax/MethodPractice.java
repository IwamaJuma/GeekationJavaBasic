package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		
		printResult(add(a,b));
		printResult(subtract(a,b));
		printResult(multiply(a,b));
		printResult(devide(a,b));

	}
	
	public static int add(int number1,int number2) {
		return number1 + number2;
	}
	public static int subtract(int number1,int number2) {
		return number1 - number2;
	}
	public static int multiply(int number1,int number2) {
		return number1 * number2;
	}
	public static int devide(int number1,int number2) {
		return number1 / number2;
	}
	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}
