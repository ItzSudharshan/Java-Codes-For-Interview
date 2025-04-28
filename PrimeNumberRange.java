import java.util.*;
public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Starting Range: ");
		int start =  sc.nextInt();
		System.out.println("Enter the Ending Range: ");
		int end = sc.nextInt();
		System.out.println("The Prime Numbers in the Given Range is...");
		for(int num = start; num<= end; num++) {
			if(num < 2) {
				continue;
			}
			boolean isPrime = true;
			for(int i = 2 ; i<= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime =  false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num+" ");
			}
		}
		

	}

}
