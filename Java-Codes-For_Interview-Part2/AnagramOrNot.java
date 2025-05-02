import java.util.*;
public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1...");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2...");
		String str2 = sc.nextLine();
		if(isAnagram(str1, str2)) {
			System.out.println(str1+" and "+str2+" is an Anagram");
		}else {
			System.out.println(str1+" and "+str2+" is not An Anagram");
		}
	}
	public static boolean isAnagram(String str1,String  str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		char first[] = str1.toCharArray();
		char second[] = str2.toCharArray();
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		return Arrays.equals(first, second);
	}

}
/*
Enter the String1...
listen
Enter the String2...
silent
listen and silent is an Anagram
--------------------------------

Enter the String1...
Sudharshan
Enter the String2...
Nayak
Sudharshan and Nayak is not An Anagram
*/