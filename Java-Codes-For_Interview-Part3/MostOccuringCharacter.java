import java.util.*;
public class MostOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input");
		String input = sc.nextLine();
		char MostOccuringCharacter = ' ';
		
		int[] freq = new int[256];
		for(int i =0 ; i< input.length(); i++) {
			freq[input.charAt(i)]++;
		}
		int max = -1;
		for(int i =0 ; i< input.length(); i++) {
			if(freq[input.charAt(i)] > max) {
				max = freq[input.charAt(i)];
				MostOccuringCharacter = input.charAt(i);
			}
		}
		System.out.println("The Most Occuring Character in the Input is "+MostOccuringCharacter+" Which occurs/appears "+max+" Times");

	}

}
/*
Enter the Input
Apple
The Most Occuring Character in the Input is p Which occurs/appears 2 Times
*/