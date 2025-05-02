import java.util.*;
public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal Value..");
		int octal = sc.nextInt();
		int decimal = OctalToDecimal(octal);
		String  Binary = decimalToBinary(decimal);
		System.out.println("The Binary Value of the Octal Input"+octal+" is "+Binary);
	}
	
	
	public static int OctalToDecimal(int octal) {
		int n = 0;
		int decimal = 0;
		while(octal > 0) {
			int rem = octal % 10;
			decimal = decimal + (int)(rem * Math.pow(8, n));
			octal /= 10;
			n++;
		}
		return decimal;
	}
	
	public static String decimalToBinary(int decimal) {
		StringBuilder BinaryResult = new StringBuilder();
		
		if(decimal == 0) {
			return "0";
		}
		while(decimal > 0) {
			int rem = decimal % 2;
			BinaryResult.insert(0, rem);
			decimal /= 2;
		}
		return BinaryResult.toString();
	}
}
/*
 * Enter the Octal Value..
65
The Binary Value of the Octal Input65 is 110101
*/
