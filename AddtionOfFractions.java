import java.util.*;
public class AddtionOfFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Fractions Below");
		System.out.println("Enter the Numerator1");
		int num1 = sc.nextInt();
		System.out.println("Enter the Denominator1");
		int den1 = sc.nextInt();
		System.out.println("Enter the Numerator2");
		int num2 = sc.nextInt();
		System.out.println("Enter the Denominator2");
		int den2 = sc.nextInt();
		performFractionAddtion(num1, den1, num2, den2);

	}
	public static void performFractionAddtion(int num1,int  den1,int  num2,int  den2) {
		int numerator;
		int denominator;
		if(den1 == den2) {
			numerator = num1 + num2;
			denominator = den1;
		}else {
			numerator = (num1 * den2) + (num2 * den1);
			denominator = (den1 * den2);
		}
		int gcd = getGcd(numerator, denominator);
		numerator = numerator/gcd;
		denominator = denominator/gcd;
		System.out.println("The Simplified fraction Result of Addtion is : ");
		System.out.println(numerator+" / "+denominator);
	}
	public static int getGcd(int a,int  b) {
		if(b == 0) {
			return a;
		}else {
			return getGcd(b, a % b);
		}
	}

}
/*
Enter the 2 Fractions Below
Enter the Numerator1
1
Enter the Denominator1
4
Enter the Numerator2
1
Enter the Denominator2
6
The Simplified fraction Result of Addtion is : 
5 / 12
*/