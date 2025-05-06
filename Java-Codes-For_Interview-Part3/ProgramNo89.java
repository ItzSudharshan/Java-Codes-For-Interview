import java.util.*;
public class ProgramNo89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentence = sc.nextLine();
		GetVowelAndConsonant(sentence);
		
	}
	
	public static void GetVowelAndConsonant(String sentence) {
		String vowel = "";
		String consonant = "";
		for(int i =0 ; i< sentence.length(); i++) {
			char currentCharacter = sentence.charAt(i);
			if(Character.isLetter(currentCharacter)) {
				if(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u'
				  || currentCharacter == 'A' || currentCharacter == 'E' || currentCharacter == 'I' || currentCharacter == 'O' || currentCharacter == 'U') {
					vowel += currentCharacter;
				}else {
					consonant += currentCharacter;
				}
			}
		}
		System.out.println("The Vowels in the Given sentence is" + vowel +" ");
		System.out.println("The Consonants in the Given Sentence is "+consonant+" ");
		String reverseOvals = Reverse(vowel);
		System.out.println("The Ovels in the Reverse Order is "+reverseOvals);
		if(isPalindrome(reverseOvals)) {
			System.out.println("The reverse Order of the Vowels form a Palindrome!");
		}else {
			System.out.println("The reverse Order of the Vowels do not form a Palindrome!");
		}
		
		if(isPalindrome(consonant)) {
			System.out.println("The Consonants  form a Palindrome");
		}else {
			System.out.println("The Consonants dont form a Palindrome");
		}
	}
	public static String  Reverse(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i>= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i>= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		if(str.equals(reverse)) {
			return true;
		}
	}
		return false;
	}
}
/*
 * Enter the Sentence: 
KodNest Technologies
The Vowels in the Given sentence isoeeooie 
The Consonants in the Given Sentence is KdNstTchnlgs 
The Ovels in the Reverse Order is eiooeeo
The reverse Order of the Vowels do not form a Palindrome!
The Consonants dont form a Palindrome
---------------------------------------------------------
Enter the Sentence: 
MADAM
The Vowels in the Given sentence isAA 
The Consonants in the Given Sentence is MDM 
The Ovels in the Reverse Order is AA
The reverse Order of the Vowels form a Palindrome!
The Consonants  form a Palindrome

 * */
