import java.util.*;
public class SmallestNumberinGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..");
		int num = sc.nextInt();
		int result = getSmallestNumberinGivenNumber(num);
		System.out.println("The Smallest Digit in The Given Number is: "+result);
	}
	public static int getSmallestNumberinGivenNumber(int num) {
		int smallest = Integer.MAX_VALUE;
		while(num != 0) {
			int rem = num % 10;
			if(rem < smallest) {
				smallest = rem;
			}
			num /= 10;
		}
		return smallest;
	}

}

/*
Enter the Number..
1289
The Smallest Digit in The Given Number is: 1
----------
Enter the Number..
9997
The Smallest Digit in The Given Number is: 7

*/