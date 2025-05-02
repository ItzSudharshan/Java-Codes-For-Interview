import java.util.*;
public class RemoveAllCharactersExceptAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String input = sc.nextLine();
		String result = input.replaceAll("[^A-Za-z]", "");
		System.out.println("The Resulting Ouput has been Obtained after removing all Characters Except Alphabets:");
		System.out.println(result);

	}

}
/*
Enter the Input
Sudh1?ars)han
The Resulting Ouput has been Obtained after removing all Characters Except Alphabets:
Sudharshan
*/