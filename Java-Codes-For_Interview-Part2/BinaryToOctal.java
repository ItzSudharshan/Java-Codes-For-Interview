import java.util.*;
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Input: ");
		int binary = sc.nextInt();
		int decimal = BinaryToDecimal(binary);
		String octal = DecimalToOctal(decimal);
		System.out.println("The Octal Conversion of the Given Binary Input "+binary+" is "+octal);
	}
	
	public static int BinaryToDecimal(int binary) {
		int n = 0 ;
		int decimal = 0;
		while(binary > 0) {
			int rem = binary % 10;
			decimal = decimal + (int)(rem*Math.pow(2, n));
			binary /= 10;
			n++;
		}
		return decimal;
	}
	
	public static String DecimalToOctal(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		StringBuilder OctalResult = new StringBuilder();
		
		while(decimal > 0) {
			int rem = decimal % 8;
			OctalResult.insert(0, rem);
			decimal /= 8;
		}
		return OctalResult.toString();
		
	}

}
/*
 * Enter the Binary Input: 
110101
The Octal Conversion of the Given Binary Input 110101 is 65
*/
