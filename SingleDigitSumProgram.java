import java.util.*;
public class SingleDigitSumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num = sc.nextInt();
		int result = getSingleDigitSum(num);
		System.out.println("The Single Digit Sum of the Given Number is "+result);

	}
	
	public static int getSingleDigitSum(int num) {
				while(num >= 10) {
					int sum = 0;
					while(num != 0) {
						sum = sum+ num % 10;
						num /= 10;
					}
					num = sum;
				}
				return num;
	}

}

/*
 * 
 * //9875 = 9 + 8 + 7 + 5 = 29 = 2 + 9 = 11 = 1 + 1 = 2 which is  a single digit sum
 * Enter the Number...
9875
The Single Digit Sum of the Given Number is 2

 * 
 * 
 * 
 */
