package labspackage;

public class ArraysLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display the average of a given integer array 
		
		double[] arr = {15,35,25.20,-164,100};
		double total = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			total = total + arr[i];
		}
		
		/* arr.length returns the number of elements
		 * present in the array
		 */
		double average = total / arr.length;
		
		/* This is used for displaying the formatted output
		 * if you give %.4f then the output would have 4 digits
		 * after decimal point
		 */
		System.out.format("The average is: %.3f", average);
	}

}
