import java.util.*;
public class LongestSubstringNoRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int left = 0;
		int right = 0;
		int maxCount = 0;
		int startIndex = 0;
		HashSet<Character> hs = new HashSet<>();
		while(right < str.length()) {
			if(!hs.contains(str.charAt(right))) {
				hs.add( str.charAt(right));
				if(hs.size() > maxCount) {
					maxCount = hs.size();
					startIndex = left;
				}
				right++;
			}else {
				hs.remove(str.charAt(left));
				left++;
			}
		}
		System.out.println("The Longest Non Repeating Substring in the Given String is "+str.substring(startIndex, startIndex + maxCount));
		System.out.println("The count of the Largest Non Repeating Substring with Unique Characters is "+maxCount);
	}

}
/*
Enter the String: 
abcabcbb
The Longest Non Repeating Substring in the Given String is abc
The count of the Largest Non Repeating Substring with Unique Characters is 3
*/