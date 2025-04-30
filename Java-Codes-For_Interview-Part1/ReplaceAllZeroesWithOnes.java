import java.util.*;
public class ReplaceAllZeroesWithOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String input = sc.nextLine();
		
		String str = "";
		for(int i = 0 ; i< input.length(); i++) {
			
			if(input.charAt(i)== '0' ) {
				str = str + "1";
			}else {
				str = str + input.charAt(i);
			}
		}
		System.out.println("The Output before Replacing all Zeros is "+input);
		System.out.println("The Output after Replacing all Zeroes with Ones is "+str);

	}

}
/*
Enter the Input:
10101
The Output before Replacing all Zeros is 10101
The Output after Replacing all Zeroes with Ones is 11111
*/