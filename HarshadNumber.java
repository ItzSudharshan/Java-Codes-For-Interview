import java.util.*;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num = sc.nextInt();
		boolean result = checkHarshadNumber(num);
		if(result) {
			System.out.println(num+" is a Harshad Number");
		}else {
			System.out.println(num+" is not a Harshad Number");
		}

	}
	public static boolean checkHarshadNumber(int num) {
		int sum = 0;
		int temp = num;
		while(temp != 0) {
			int rem = temp % 10;
			sum= sum + rem;
			temp /= 10;
		}
		return (num % sum == 0);
	}

}
/*
Enter the Number...
18
18 is a Harshad Number
--------------------
Enter the Number...
19
19 is not a Harshad Number
*/