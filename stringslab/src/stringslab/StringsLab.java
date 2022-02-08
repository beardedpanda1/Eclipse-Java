package stringslab;
import java.util.Scanner;

public class StringsLab {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0, i = 0;
		System.out.println("Enter a string: ");
		String str = scan.nextLine();
		
		while(i<str.length())
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
			i++;
		}
		System.out.println("The total number of characters = " + count);
	}

}
