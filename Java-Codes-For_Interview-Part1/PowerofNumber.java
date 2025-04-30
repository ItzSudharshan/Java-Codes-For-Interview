import java.util.*;
public class PowerofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("Enter the Power : ");
		int power = sc.nextInt();
		int result = power(num, power);
		System.out.println("The Result is "+result);

	}
	public static int power(int num, int power) {
		int result = 1;
		for(int i = 0 ; i< power ; i++) {
			result = result * num;
		}
		return result;
	}
}
/*
Enter the Number: 
2
Enter the Power : 
4
The Result is 16

*/