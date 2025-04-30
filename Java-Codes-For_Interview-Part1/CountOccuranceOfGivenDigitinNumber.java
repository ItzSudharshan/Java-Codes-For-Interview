import java.util.*;
public class CountOccuranceOfGivenDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		int num = sc.nextInt();
		System.out.println("Enter the Number that u want to get the count of: ");
		int targetNum = sc.nextInt();
		int result = getCount(num, targetNum);
		System.out.println("The Target Number "+targetNum+" appears "+result+" Times. ");
	}
	public static int  getCount(int num, int targetNum) {
		int count = 0;
		while(num != 0) {
			int rem = num % 10;
			if(rem ==  targetNum) {
				count++;
			}
			num /= 10;
		}
		return count;
	}
}
/*
Enter the Input: 
111124
Enter the Number that u want to get the count of: 
1
The Target Number 1 appears 4 Times. 

*/