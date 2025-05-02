import java.util.*;
public class ReplacerStringwithSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String str = sc.nextLine();
		System.out.println("Enter the String that u want to Replace: ");
		String wordToBeReplaced = sc.nextLine();
		System.out.println("Enter the Replacement word: ");
		String replacementWord = sc.nextLine();
		String finalResult = str.replace(wordToBeReplaced , replacementWord);
		System.out.println("The Final Output after Performing Respective Changes is "+finalResult
				);
	}

}
/*
Enter the String..
I Name is Sudharshan Nayak
Enter the String that u want to Replace: 
I
Enter the Replacement word: 
My
The Final Output after Performing Respective Changes is My Name is Sudharshan Nayak

*/