import java.util.*;
public class StrongNumber {
	//1! + 4! + 5! = 1 + 24 + 120 = 145
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(isStrongNumber(num)) {
			System.out.println(num+" is a Strong Number");
		}else {
			System.out.println(num+" is not a Strong Number");
		}

	}
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num*factorial(num - 1);
		}
	}
	
	
	public static boolean isStrongNumber(int num) {
		int sum = 0;
		int temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			sum = sum + factorial(digit);
			temp /= 10;
		}
		return num == sum;
	}
}
/*
 * Enter the Number
145
145 is a Strong Number
-----------------------
Enter the Number
146
146 is not a Strong Number


*/
