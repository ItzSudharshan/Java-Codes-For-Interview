import java.util.*;
public class ArrangeStringCanPaldinromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		if(isPalindromePossible(str)) {
			System.out.println(str+" Can be Re arranged to Form a Palidrome");
		}else {
			System.out.println(str+" Cannot be Re arranged to Form a Palidrome");
		}

	}
	public static boolean isPalindromePossible(String str) {
		int oddCount = 0;
		int charCount[] = new int[256];
		for(char freq : str.toCharArray()) {
			charCount[freq]++;
		}
		for(int count: charCount) {
			if(count %2 != 0) {
				oddCount++;
			}
		}
		return oddCount <= 1;
	}
}
/*
Enter the String
ivicc
ivicc Can be Re arranged to Form a Palidrome
--------------------------------------------
Enter the String
abcd
abcd Cannot be Re arranged to Form a Palidrome

*/