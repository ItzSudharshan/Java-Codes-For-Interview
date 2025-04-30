import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		boolean isPrime = checkPrime(num);
		if(isPrime) {
			System.out.println(num+" is a Prime Number");
		}else {
			System.out.println(num+" is not a Prime Number");
		}

	}
	
	public static boolean checkPrime(int num) {
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
 * Enter the Number
5
5 is a Prime Number
----------------
Enter the Number
4
4 is not a Prime Number
*/