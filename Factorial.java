import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int result = getFactorial(num);
		System.out.println("The Factorail of "+num+" is "+result);
	}
	
	public static int  getFactorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num * getFactorial(num - 1);
		}
	}

}
/*
 * Enter the Number
3
The Factorail of 3 is 6
*/
