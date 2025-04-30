import java.util.*;
public class AbundantNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i< num ; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(sum > num) {
			System.out.println(num+" is an Abundant Number");
			System.out.println("The Abundance is "+(sum - num));
		}else {
			System.out.println(num+" is not An Abundant Number");
		}
	}

}
/*
Enter the Number:
7
7 is not An Abundant Number
---------------------------
Enter the Number:
12
12 is an Abundant Number
The Abundance is 4

*/