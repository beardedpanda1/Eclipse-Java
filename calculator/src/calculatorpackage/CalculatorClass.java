package calculatorpackage;
import java.util.Scanner;
public class CalculatorClass {
	static double num1, num2, result;
	static Scanner scan = new Scanner(System.in);
	static double addMethod() 
	{
		System.out.println("Enter first number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter second number: ");
		num2 = scan.nextDouble();
		return num1+num2;
	}
	static double subtractMethod()
	{
		System.out.println("Enter first number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter second number: ");
		num2 = scan.nextDouble();
		return num1-num2;
	}
	static double multiplyMethod()
	{
		System.out.println("Enter first number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter second number: ");
		num2 = scan.nextDouble();
		return num1*num2;
	}
	static double divideMethod()
	{
		System.out.println("Enter first number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter second number: ");
		num2 = scan.nextDouble();
		return num1/num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enter option here
		System.out.println("Choose an option between 1-5: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		int option = scan.nextInt();
		
		//enter numbers
		
		
		switch (option) {
		//addition
		case 1:
			result=addMethod();
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case 2:
			result=subtractMethod();
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case 3:
			result=multiplyMethod();
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case 4:
			result=divideMethod();
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case 5:
			//somehow end application
			System.out.println("Exiting application.");
			break;
		default:
			System.out.println("Invaid option!");
			System.exit(0);
			break;
		}
		
		
	}

}
