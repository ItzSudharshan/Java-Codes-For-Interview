import java.util.*;
public class CheckFrequencyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		getFrequencyofCharacter(str);
	}
	public static void getFrequencyofCharacter(String str) {
		LinkedHashMap<Character, Integer> Lhp = new LinkedHashMap<>();
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Lhp.containsKey(ch)) {
				Lhp.put(ch,Lhp.get(ch)+ 1);
			}else {
				Lhp.put(ch, 1);
			}
		}
		System.out.println("The Frequency of The Charaters is Given Below: ");
		for(Map.Entry<Character, Integer> entry : Lhp.entrySet()) {
			int frequency = entry.getValue();
			char character = entry.getKey();
			System.out.println(character+" Repeats "+frequency+" Times");
		}
	}

}
/*
Enter the String: 
Sudharshan
The Frequency of The Charaters us Given Below: 
S Repeats 1 Times
u Repeats 1 Times
d Repeats 1 Times
h Repeats 2 Times
a Repeats 2 Times
r Repeats 1 Times
s Repeats 1 Times
n Repeats 1 Times
*/