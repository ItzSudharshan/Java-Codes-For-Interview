import java.util.*;
public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println(num+" is a Palindrome.");
		}else {
			System.out.println(num+" is not a Palindrome.");
		}

	}
	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		return rev == num;
	}

}
/*
Enter the Number: 
121
121 is a Palindrome.
--------------------
Enter the Number: 
123
123 is not a Palindrome.
*/