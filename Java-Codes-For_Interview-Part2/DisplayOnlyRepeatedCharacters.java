import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class DisplayOnlyRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		getRepeatedCharacter(str);
	}
	public static void getRepeatedCharacter(String str) {
		LinkedHashMap<Character, Integer> Lhp = new LinkedHashMap<>();
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Lhp.containsKey(ch)) {
				Lhp.put(ch,Lhp.get(ch)+ 1);
			}else {
				Lhp.put(ch, 1);
			}
		}
		System.out.println("The Repeated Charaters is Given Below: ");
		for(Map.Entry<Character, Integer> entry : Lhp.entrySet()) {
			int frequency = entry.getValue();
			char character = entry.getKey();
			if(frequency> 1) {
				System.out.println(character+" Repeats "+frequency+" Times");
			}
			
		}
	}

}
/*
Enter the String: 
Sudharshan
The Repeated Charaters is Given Below: 
h Repeats 2 Times
a Repeats 2 Times
*/