import java.util.*;
public class TogglreUpperToLowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = sc.nextLine();
		String result = "";
		for(int i =0 ; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				result = result + Character.toUpperCase(ch);
			}else if(Character.isUpperCase(ch)) {
				result = result + Character.toLowerCase(ch);
			}else {
				result = result + ch;
			}
		}
		System.out.println("The Toggled String is Given as Below: ");
		System.out.println(result);
	}

}
/*
Enter the Input
Sudharshan Nayak
The Toggled String is Given as Below: 
sUDHARSHAN nAYAK
*/