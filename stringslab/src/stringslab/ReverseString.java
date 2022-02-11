package stringslab;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = scan.nextLine();
		System.out.println("After reverse string is: ");
		for(int i=str.length(); i>0; --i)
		{
			System.out.print(str.charAt(i-1));
		}
	}

}
