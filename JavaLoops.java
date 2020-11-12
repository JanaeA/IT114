package homework;

public class JavaLoops {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 7, 12, 32, 56, 77 };
		
		//I simply used a for loop. I made the loop start at the beginning of the array and stop at the
		//end of the array by using the .length variable.
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println(" ");

		//Used the modulus operator. The if statement is basically saying if the remainder of the number 
		//divided by two is zero, then print out the number. This allows only even numbers to be printed
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				System.out.print(nums[i] + " ");
			}
		}
		
		
	}
}
