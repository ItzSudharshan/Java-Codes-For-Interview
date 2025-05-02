import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String reverse = "";
		for(int i = str.length() - 1; i>= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println(str+" reverse is "+reverse+" and hence  is a Palidrome");
		}else {
			System.out.println(str+" reverse is  "+reverse+" and hence is not a Palidrome");
		}
	}

}
/*
Enter the String: 
aba
aba reverse is aba and hence  is a Palidrome
-------------------------------------------
Enter the String: 
abc
abc reverse is  cba and hence is not a Palidrome

*/