package demo;
import java.util.Scanner;
public class MyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;	
		
		int[] num1 = new int[] {10,20,30,40,50};
		
		int num2[] = new int[10];
		
		char somecharacters[] = new char[5];
		
		String myStrings[] = new String[5];
		
		String newString[] = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter some numbers: ");
		for(int i=0; i<num2.length; i++)
		{
			num2[i] = scan.nextInt();
		}
		
		System.out.println("Array values are: ");
		for(int i = 0; i<num2.length; i++)
		{
			System.out.println(num2);
		}
		
		
		scan.nextLine();
		System.out.println("Please enter some names: ");
		for(int i = 0; i<myStrings.length; i++)
		{
			myStrings[i] = scan.nextLine();
			
		}
		
		System.arraycopy(myStrings, 2, newString, 0, 5);
		for (String name : newString) 
		{
			System.out.println(name + " ");
		}
	}

}
