import java.util.*;
public class FriendlyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First  Number..");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number..");
		int num2 = sc.nextInt();
		int divisor1 = getDivisorSum(num1);
		int divisor2 = getDivisorSum(num2);
		if(divisor1/num1 == divisor2/num2) {
			System.out.println("Both are Friendly Pair");
		}else {
			System.out.println("Not a Friendly Pair");
		}
	}
	public static int getDivisorSum(int num) {
		int sum = 0;
		for(int i = 1; i< num ; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
/*
 * Enter the First  Number..
6
Enter the Second Number..
28
Both are Friendly Pair
----------------
Enter the First  Number..
6
Enter the Second Number..
29
Not a Friendly Pair
*/
