import java.util.*;
public class CountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		int num = sc.nextInt();
		int result = CountNumberOfDigits(num);
		System.out.println("The Number of Digits in the Input is: "+result);
		
	}
	
	public static int CountNumberOfDigits(int num) {
		int count = 0;
		int temp = num;
		while(temp != 0) {
			temp /= 10;
			count++;
		}
		return count;
	}

}
/*
Enter the Input
123456
The Number of Digits in the Input is: 6*/