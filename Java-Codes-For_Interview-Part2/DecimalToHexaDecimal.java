import java.util.*;
public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Input: ");
		int decimal = sc.nextInt();
		String hexaDecimalResult = convertToHexadecimal(decimal);
		System.out.println("The Hexadecimal Result of the decimal "+decimal+" is "+hexaDecimalResult);
	}
	public static String convertToHexadecimal(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder hexaDecimalResult = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 16;
			
			char hex;
			if(rem < 10) {
				hex = (char)('0' + rem);
			}else {
				hex = (char)('A' + rem - 10);
			}
			hexaDecimalResult.insert(0, hex);
			decimal /= 16;
		}
		return hexaDecimalResult.toString();
	}
}
/*
 * Enter the Decimal Input: 
255
The Hexadecimal Result of the decimal 255 is FF
*/
