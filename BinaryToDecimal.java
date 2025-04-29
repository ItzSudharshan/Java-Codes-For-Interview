import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number");
		int binary = sc.nextInt();
		int result = convertToDecimal(binary);
		System.out.println("The Decimal Convertion from Binary Number "+binary+" is "+result);

	}
	public static int convertToDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while(binary > 0) {
			int temp = binary % 10;
			decimal = decimal + (int)(temp*Math.pow(2, n));
			binary /= 10;
			n++;
			
		}
		return decimal;
	}
}
/*
Enter the Binary Number
101
The Decimal Convertion from Binary Number 101 is 5
*/