import java.util.*;
public class ReturnNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The String input: ");
		String str = sc.nextLine();
		String Numbers = "";
		for(int i = 0 ; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				Numbers += ch;
			}
		}
		System.out.println("The Number From  the Input is ");
		System.out.println(Numbers+" ");

	}

}
/*
Enter The String input: 
My Name1 is Sudh2arsh3an
The Number From  the Input is 
123 
*/