import java.util.*;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String sentence = sc.nextLine();
		char result = getFirstNonRepeatingCharacter(sentence);
		if(result != 0) {
			System.out.println("The First Non Repeating Character is "+result);
		}else {
			System.out.println("All are Repeating Characters...");
		}
		
	}
	public static char getFirstNonRepeatingCharacter(String sentence) {
		int[] frequency = new int[256];
		
		for(int i = 0 ; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			frequency[sentence.charAt(i)]++;
		}
		for(int i = 0 ; i< sentence.length(); i++) {
			if(frequency[sentence.charAt(i)] == 1) {
				return sentence.charAt(i);
			}
		}
		return 0;
	}
	

}
/*
Enter the Input
Sudharshan
The First Non Repeating Character is S
---------------------------------------
Enter the Input
aaa
All are Repeating Characters...
*/
