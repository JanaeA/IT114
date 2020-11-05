package homework;

public class Recursion {
	  
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1);
		}
		return 0;
	}
	
	public static int loopSum(int num) {
		int sum = 0;
		for(int i=num; i>0; i--) {
			sum+=i;
		}
		return sum;
	}
	
	public static int whileSum(int num) {
		int sum = 0;
		while(num>0) {
			sum+=num;
			num--;
		}
		return sum; 
	}

	public static void main(String[] args) {
		System.out.println("Recursion Loop: " + sum(10));
		System.out.println("For Loop: " + loopSum(10));
		System.out.println("While Loop: " + whileSum(10));
	}
}
