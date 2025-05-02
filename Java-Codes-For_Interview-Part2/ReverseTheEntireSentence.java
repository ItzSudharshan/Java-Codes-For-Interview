import java.util.*;
public class ReverseTheEntireSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentence = sc.nextLine();
		StringBuilder reversedSentence = new StringBuilder();
		String[] words = sentence.split(" ");
		for(int i = words.length - 1 ; i>= 0 ; i--) {
			reversedSentence.append(words[i]);
			
			if(i != 0) {
				reversedSentence.append(" ");
			}
		}
		System.out.println("The Reverse of the Above Sentence is : ");
		System.out.println(reversedSentence);

	}

}
/*
Enter the Sentence: 
My Name is Sudharshan Nayak 
The Reverse of the Above Sentence is : 
Nayak Sudharshan is Name My
*/