import java.util.*;
public class ExtractDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Input: ");
		String input = sc.nextLine();
		char words[] = input.toCharArray();
		StringBuilder DigitsResult = new StringBuilder();
		for(int i =0 ; i< input.length(); i++) {
			char currentElement = words[i];
			if(Character.isDigit(currentElement)) {
				DigitsResult.append(currentElement);
			}
		}
		System.out.println("The Digits in the Current String Input is "+DigitsResult);
		
	}

}
/*
Enter the String Input: 
Sudhar6sha9n Na42ya0k
The Digits in the Current String Input is 69420
*/