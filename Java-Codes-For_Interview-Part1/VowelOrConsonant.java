import java.util.*;
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character Input: ");
		char ch = sc.next().charAt(0);
		if(Character.isLetter(ch)) {
			char input = Character.toLowerCase(ch);
			if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
				System.out.println(ch+" is  a Vowel");
			}else {
				System.out.println(ch+" is a Consonant");
			}
		}else {
			System.out.println("The Input is not a Alphabet");
		}

	}
}
/*
Enter the Character Input: 
a
a is  a Vowel
---------------
Enter the Character Input: 
T
T is a Consonant

*/
