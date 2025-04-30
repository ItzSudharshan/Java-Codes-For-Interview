import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		int power = getLength(num);
		if(isArmstrong(num, power)) {
			System.out.println(num+" is an Armstrong Number");
		}else {
			System.out.println(num+" is not an Armstrong Number");
		}

	}
	
	public static int getLength(int num) {
		int length = 0;
		while(num != 0) {
			num = num / 10;
			length++;
		}
		return length;
	}
	
	public static boolean isArmstrong(int num, int length) {
		int sum = 0;
		int digit , temp;
		temp = num;
		while(temp != 0) {
			digit = temp % 10;
			sum = sum + (int)Math.pow(digit, length);
			temp /= 10;
		}
		if(num == sum) {
			return true;
		}else {
			return false;
		}
	}

}
/*
 * Enter The Number: 
153
153 is an Armstrong Number
-----------
Enter The Number: 
154
154 is not an Armstrong Number
*/
