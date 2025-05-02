import java.util.*;
public class CapitalizeFirstAndLastLetterOfEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentence = sc.nextLine();
		String CapitalizeFirstAndLastLetter = "";
		String str[] = sentence.split(" ");

		for(String words : str) {
			int length = words.length();
			if(length > 1) {
				String firstLetter  = words.substring(0, 1);
				String MiddleLetter = words.substring(1,words.length() -1);
				char lastLetter = words.charAt(length - 1);
				CapitalizeFirstAndLastLetter = CapitalizeFirstAndLastLetter + firstLetter.toUpperCase() 
				+ MiddleLetter + Character.toUpperCase(lastLetter) + " ";
				
			}else {
				 CapitalizeFirstAndLastLetter += words.toUpperCase() + " ";
				
			}

		}
		System.out.println("The Result after Capitzalizing First letter and last letter of each word is " + CapitalizeFirstAndLastLetter);
	}

}
/*
 * Enter the Sentence: 
My Name is Sudharshan nayak
The Result after Capitzalizing First letter and last letter of each word is MY NamE IS SudharshaN NayaK 
*/
