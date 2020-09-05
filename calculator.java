package machineproblem1;

import java.util.Scanner;

public class calculator {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float A;
		float B;
		String operation;
		float Exit = 0;
		
		do {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Welcome to the Calculator designed by mycalc.group1 \r\n" + 
				"Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
		operation = myScan.next(); 
					
		//Scanner.close();
		switch(operation) {
		case "A":
			System.out.println("Please enter arg 1 \n");
			A= Float.parseFloat( myScan.next());
			System.out.println("Please enter arg 2 \n");
			B= Float.parseFloat( myScan.next());
			System.out.println("The result of your addition is " + calculator.addition(A, B));
			break;
		case "S":
			System.out.println("Please enter arg 1 \n");
			A= Float.parseFloat( myScan.next());
			System.out.println("Please enter arg 2 \n");
			B= Float.parseFloat( myScan.next());
			System.out.println("The result of your subtraction is " + calculator.subtract(A, B));
			break;
		case "M":
			System.out.println("Please enter arg 1 \n");
			A= Float.parseFloat( myScan.next());
			System.out.println("Please enter arg 2 \n");
			B= Float.parseFloat( myScan.next());
			System.out.println("The result of your multiplication is " + calculator.multiply(A, B)); 
			break;
		case "Q":
			System.out.println("Exiting, have a nice day");
			Exit = 1;
			break;
		default:
			System.out.println("PLease learn to follow instructions. BYEEEE");
		} 
		} while (Exit == 0 );
	
	}

	public static float addition(float A, float B) {
		return (A + B);
	}
	public static float subtract(float A, float B) {
		return (A - B);
	}
	public static float multiply(float A, float B) {
		return (A * B);
	}

}
