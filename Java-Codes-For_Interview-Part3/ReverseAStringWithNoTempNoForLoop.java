import java.util.*;
public class ReverseAStringWithNoTempNoForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("The Reverse of the String without using Third Varible is ");
		int left = 0;
		int right = str.length() - 1;
		char wordArray[] = str.toCharArray();
		while(left < right) {
			wordArray[left] = (char) (wordArray[left] + wordArray[right]);
			wordArray[right] = (char) (wordArray[left] - wordArray[right]);
			wordArray[left] = (char) (wordArray[left] - wordArray[right]);
			left++;
			right--;
		}
		System.out.println(new String(wordArray));
		
	}

	
}
/*
Enter the String:
Sudharshan
The Reverse of the String without using Third Varible is 
nahsrahduS
*/