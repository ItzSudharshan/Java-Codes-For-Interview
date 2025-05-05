import java.util.*;
public class CapitalizeEachWordOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String sentence = sc.nextLine();
		String words[] = sentence.split(" ");
		String FinalResult = "";
		for(String word : words) {
			int length = words.length;
			if(word.length() > 0) {
				String FirstLetter = word.substring(0, 1).toUpperCase();
				String remainingLetters = word.substring(1);
				FinalResult += FirstLetter + remainingLetters + " ";
			}
		}
		System.out.println("The Final Result in which First Letter of Each word is Capitalized is "+FinalResult);
	}

}
/*
Enter the String: 
my name is sudharshan nayak
The Final Result in which First Letter of Each word is Capitalized is My Name Is Sudharshan Nayak 
*/