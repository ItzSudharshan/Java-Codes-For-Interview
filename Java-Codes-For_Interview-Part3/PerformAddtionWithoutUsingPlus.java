import java.util.*;
public class PerformAddtionWithoutUsingPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int num2 = sc.nextInt();
		int sum = 0;
		while(num2 != 0) {
			int carry = num1 & num2;
			num1 = num1 ^ num2;
			num2 = carry << 1;
		}
		System.out.println("The Sum is "+num1);
	}

}
/*
Enter the Number 1: 
10
Enter the Number 2: 
15
The Sum is 25
*/