import java.util.*;
public class RemoveAllOccurancesSpecifiedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		System.out.println("Enter the Removal Word: ");
		String removalWord = sc.nextLine();
		String finalResult = str.replace(removalWord, "");
		System.out.println("The Final Output after Removing the Removal Word is "+finalResult);

	}

}
/*
Enter the String: 
My Name is Sudharshan Nayak HI!
Enter the Removal Word: 
HI!
The Final Output after Removing the Removal Word is My Name is Sudharshan Nayak 
*/