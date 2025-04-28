import java.util.*;
public class NPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		int N = sc.nextInt();
		int count = 1;
		System.out.println("The "+N+" Prime Numbers are : ");
		for(int i = 2; count<= N; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		
	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		
		for(int i = 2 ; i<= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
/*
 * Enter the Input: 
5
The 5 Prime Numbers are : 
2 3 5 7 11 */
