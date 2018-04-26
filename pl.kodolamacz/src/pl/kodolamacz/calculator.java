package pl.kodolamacz;

import java.util.Scanner;

/**
 * 
 * @author bev
 * Simple console calculator which asking for first number, next asking for type of action
 * and after that asking for second number. Then it gives result.
 */

public class calculator {

	public static void main(String[] args) {
		
		Scanner loadData = new Scanner(System.in);
		System.out.println("Welcome in calculator app!");
	
			
		
		System.out.println("What kind of operation do you want to make? Addition, Substract, Divide, Multiply or Modulo");
		System.out.println("(write +, -, /, * or % and confirm by enter) or \"q\" to exit");
			
		String typeOfAction = loadData.next();

		System.out.println("Enter first number: ");
		Float number1 = loadData.nextFloat();
		System.out.println("Enter second number: ");
		Float number2 = loadData.nextFloat();
			
		System.out.print(result(typeOfAction, number1, number2));
		
		loadData.close();
	}
	
	/**
	 * 
	 * @param act - sending type of action
	 * @param a - first number
	 * @param b - second number
	 * @return result - result of operation between number1 and number2
	 */
	public static String result (String act, float a, float b) {
		String result = "";
		String operation = a+" "+act+" "+b+" = ";
		
		if(act.equals("+"))
			result = operation+Float.toString(a+b);
		else if(act.equals("-"))
			result = operation+Float.toString(a-b);
		else if(act.equals("/")) {
			if(b == 0)
				result = "Can't divide by 0";
			else
				result = operation+Float.toString(a/b);
		}
		else if(act.equals("*"))
			result = operation+Float.toString(a*b);
		else if(act.equals("%"))
			result = operation+Float.toString(a%b);
		else
			result = "There is no such operation!";
		
		return result;
	}

}
