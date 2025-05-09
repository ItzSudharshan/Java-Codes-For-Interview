import java.util.*;
public class ProgramNo102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String input = sc.nextLine();
		String result = " ";
		boolean foundNonZero = false;
		for(int i = 0 ; i < input.length(); i++) {
			char currentCharacter = input.charAt(i);
			if(!foundNonZero) {
				if(currentCharacter != '0') {
					foundNonZero = true;
					result += currentCharacter;
				}
			}else {
				result += currentCharacter;
			}
		}
		System.out.println("The 0s from the front have been removed and the Output is "+result);

	}

}
/*
Enter the Input: 
0000123401
The 0s from the front have been removed and the Output is  123401
*/