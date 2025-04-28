import java.util.*;
public class FibonacciNthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Fibonacci Term that u want to find..");
		int num = sc.nextInt();
		int result = getNthFibonacciTerm(num);
		System.out.println("The "+num+"Th Fibonacci number is "+result);
	}
	
	public static int getNthFibonacciTerm(int num) {
		if(num == 1) {
			return 0;
		}
		
		if(num == 2) {
			return 1;
		}
		int current = 0;
		int prev1 = 0;
		int prev2 = 1;
		for(int i = 3; i<= num; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}

}
/*
Enter the Nth Fibonacci Term that u want to find..
3
The 3Th Fibonacci number is 1
*/