import java.util.*;
public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num <= 0 || num > 9999) {
			System.out.println("Please Enter a Valid Number from Range 0 to 9999");
			System.exit(0);
		}else {
			String words = convertToWords(num);
			System.out.println("The Number ("+num+") in words is :-> "+words);
		}

	}
	public static String convertToWords(int num) {
		String[] words1to19 = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
							   "Eleven", "Tweleve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "NineTeen"};
		
		String[] words20to90 = {" "," ","Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
		
		if(num == 0) {
			return "Zero";
		}
		String words = "";
		if(num >= 1000) {
			words = words + words1to19[num / 1000] + "\tThousand\t";
			num = num % 1000;
		}
		
		if(num >= 100) {
			words = words + words1to19[num / 100] + "\tHundred\t";
			num = num % 100;
		}
		
		if(num > 0) {
			if(num < 20) {
				words = words + words1to19[num];
			}else {
				words = words + words20to90[num / 10] + " " + words1to19[num % 10];
			}
		}
		return words.trim();
	}

}
/*
 * Enter the Number
69
The Number (69) in words is :-> Sixty Nine
-----------------------------------------
Enter the Number
420
The Number (420) in words is :-> Four	Hundred	Twenty

*/
