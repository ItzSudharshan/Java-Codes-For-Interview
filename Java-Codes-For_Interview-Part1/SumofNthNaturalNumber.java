import  java.util.*;
public class SumofNthNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NTh Term: ");
		int n = sc.nextInt();
		int result = n*(n + 1)/2;
		System.out.println("The sum of the "+n+" Th Natural Number is "+result);
	}

}
/*
Enter the NTh Term: 
5
The sum of the 5 Th Natural Number is 15
 1 + 2 + 3 + 4 + 5 = 15
*/