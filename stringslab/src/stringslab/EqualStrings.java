package stringslab;
import java.util.Scanner;
public class EqualStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//read first string
		System.out.println("Enter first string: ");
		String str1 = scan.nextLine();
		
		//read second string
		System.out.println("Enter second string: ");
		String str2 = scan.nextLine();
		
		boolean areTwoStringsEqual = str1.equals(str2);
		
		System.out.println("Two strings are equal: "+areTwoStringsEqual);
	}

}
