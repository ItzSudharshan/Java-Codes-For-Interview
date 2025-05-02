import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int decimal = sc.nextInt();
		String binary = ConvertToBinary(decimal);
		System.out.println("The Binary conversion of the Given Decimal Number "+decimal+" is "+binary);
	}
	public static String ConvertToBinary(int decimal) {
		if(decimal == 0) {
			return "0";
		}
		
		StringBuilder BinaryResult = new StringBuilder();
		while(decimal > 0) {
			int rem = decimal % 2;
			BinaryResult.insert(0, rem);
			decimal /= 2;
		}
		return BinaryResult.toString();
	}
}
/*
Enter the Decimal Number: 
25
The Binary conversion of the Given Decimal Number 25 is 11001
*/