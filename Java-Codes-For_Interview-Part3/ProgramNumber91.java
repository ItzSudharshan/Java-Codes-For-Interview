import java.util.*;
public class ProgramNumber91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Number: ");
		int num = sc.nextInt();
		int count = 0;
		System.out.println("The Pairs that form the Sum "+num+" is ");
		for(int A = num - 1; A > num/2; A--) {
			int B = num - A;
			System.out.println("( "+A+", "+B+" )");
			count++;
		}
		System.out.println("The Number of Pairs that can form the sum is "+count);
	}

}
/*
Enter the Input Number: 
10
The Pairs that form the Sum 10 is 
( 9, 1 )
( 8, 2 )
( 7, 3 )
( 6, 4 )
The Number of Pairs that can form the sum is 4
*/