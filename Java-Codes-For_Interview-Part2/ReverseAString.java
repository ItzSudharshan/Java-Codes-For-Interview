import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		String reverse = "";
		for(int i = str.length() - 1; i>= 0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The Reverse of the String "+str+" is "+reverse);

	}

}
/*
Enter the String 
baa
The Reverse of the String baa is aab
*/