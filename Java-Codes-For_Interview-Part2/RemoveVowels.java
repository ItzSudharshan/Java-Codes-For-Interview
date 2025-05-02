import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String str = sc.nextLine();
		String result = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("The Output after Removing all vowels is : "+result);

	}

}
/*
Enter the Input: 
Sudharshan
The Output after Removing all vowels is : Sdhrshn
*/