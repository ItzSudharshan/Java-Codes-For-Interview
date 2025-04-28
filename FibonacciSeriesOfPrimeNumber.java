import java.util.*;
public class FibonacciSeriesOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N: ");
		int n = sc.nextInt();
		System.out.println("The Fibonacci Series Which are also Prime upto "+n+" terms are");
		for(int i = 1; i<= n ; i++) {
			int fibonacci = getFibonacci(i);
			if(isPrime(fibonacci)) {
				System.out.print(fibonacci+" ");
			}
		}
	}
	public static int getFibonacci(int n) {
		int a = 0 ;
		int b = 1;
		if(n == 1) return 0;
		if(n == 2) return 1;
		for(int i = 3 ; i<= n ; i++) {
		int nextTerm = a + b;
		a = b ;
		b = nextTerm;
		}
		return b;
	}
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int  i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
/*
 * Enter the Value of N: 
20
The Fibonacci Series Which are also Prime upto 20 terms are
2 3 5 13 89 233 1597 
*/
