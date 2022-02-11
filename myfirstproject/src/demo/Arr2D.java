package demo;
import java.util.Scanner;
public class Arr2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//int[][] num1 = new int[][] {{1,2,3,4},{5,6,7,8}};
		//line 10 sets up array in 3 rows and 3 columns
		int[][] num2 = new int[3][3];
		//user input values
		System.out.println("Enter your values: ");
		for(int i=0;i<num2.length;i++)
		{
			for(int j=0;j<num2[0].length;j++)
			{
				num2[i][j] = scan.nextInt();
			}
			
		}
		for(int i=0;i<num2.length;i++)
		{
			for(int j=0;j<num2[0].length;j++)
			{
				System.out.print(num2[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}
