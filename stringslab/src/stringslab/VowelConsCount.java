package stringslab;

public class VowelConsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize
		int vowelCount = 0, consCount = 0;
		
		//declare string
		String str = "This is a string of sorts I think.";
		
		//convert string to lowercase
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			//checks for vowels
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				//increments vowel counter
				vowelCount++;
			}
			//checks whether character is consonant
			else if(str.charAt(i) >='a' && str.charAt(i)<='z') 
			{
				//increments cons count
				consCount++;
			}
		}
		System.out.println("Number in vowels: "+vowelCount);
		System.out.println("Number in consonants: "+consCount);
	}

}
