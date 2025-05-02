import java.util.*;
public class RemoveAllBracketsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String str = sc.nextLine();
		String result = str.replaceAll("[()\\[\\]\\{}]", "");
		System.out.println("The Resulting Output has been Obtained by removing all brackets:");
		System.out.println(result);

	}

}
/*
Enter the String..
Sudh()ars{}ha[n]
The Resulting Output has been Obtained by removing all brackets:
Sudharshan
*/