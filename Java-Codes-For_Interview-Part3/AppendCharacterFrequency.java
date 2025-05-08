import java.util.*;

public class AppendCharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String sentence = sc.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != '\t') {
                if (treeMap.containsKey(ch)) {
                    treeMap.put(ch, treeMap.get(ch) + 1);
                } else {
                    treeMap.put(ch, 1);
                }
            }
        }

        System.out.println("The Character Frequency Appended is as below: ");
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            char element = entry.getKey();
            int frequency = entry.getValue();
            System.out.print(element + "" + frequency);
        }
    }
}
/*
Enter the String: 
Sudharshan
The Character Frequency Appended is as below: 
S1a2d1h2n1r1s1u1
*/