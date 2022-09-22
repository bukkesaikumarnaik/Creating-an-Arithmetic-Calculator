package Arithmetic;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int result;
		byte choice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Arithmetic Calculator");
		System.out.println("Press 1 to ADD");
		System.out.println("Press 2 to SUBTRACT");
		System.out.println("Press 3 to MULTIPLY");
		System.out.println("Press 4 to DIVIDE");
		System.out.println("Press 5 to MODULO");
		
		System.out.println("Enter your choice: ");
		choice = scan.nextByte();
		
		
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();
		
		if(choice == 1)
		{
			result = num1 + num2;
			System.out.println("The sum is: " + result);
		}
		
		else if(choice == 2)
		{
			result = num1 - num2;
			System.out.println("The difference  is: " + result);
		}
		
		else if(choice == 3)
		{
			result = num1 * num2;
			System.out.println("The product is: " + result);
		}
		
		else if(choice == 4)
		{
			result = num1 / num2;
			System.out.println("The quotient is: " + result);
		}
		
		else if(choice == 5)
		{
			result = num1 % num2;
			System.out.println("The modulo is: " + result);
		}
		else
			System.out.println("sorry invalid choice");


	}

}
	
		
