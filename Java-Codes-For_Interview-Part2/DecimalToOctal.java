import java.util.*;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int decimal = sc.nextInt();
		String octal  = convertToOctal(decimal);
		System.out.println("The Octal Value of the Entered Decimal Number "+decimal+" is "+octal);

	}
	public static String convertToOctal(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder octalresult = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 8;
			octalresult.insert(0, rem);
			decimal /= 8;
		}
		return octalresult.toString();
	}

}
/*
Enter the Decimal Number: 
25
The Octal Value of the Entered Decimal Number 25 is 31
*/