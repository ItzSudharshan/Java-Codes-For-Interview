import java.util.*;
public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal Number:");
		int octal = sc.nextInt();
		int decimal = convertToDecimal(octal);
		System.out.println("The Decimal value of the Octal Input "+octal+" is "+decimal);

	}
	public static int convertToDecimal(int octal) {
		int decimal = 0;
		int n = 0;
		while(octal > 0) {
			int temp = octal % 10;
			decimal = decimal + (int)(temp * Math.pow(8, n));
			octal /= 10;
			n++;
		}
		return decimal;
	}

}
/*
Enter the Octal Number:
157
The Decimal value of the Octal Input 157 is 111

*/