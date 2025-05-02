import java.util.*;

public class CountNumberOfVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        int vowelCount = 0;
        boolean hasOnlyAlphabets = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char chLowercase = Character.toLowerCase(ch);

            if (Character.isLetter(chLowercase)) {
                if (chLowercase == 'a' || chLowercase == 'e' || chLowercase == 'i' || chLowercase == 'o' || chLowercase == 'u') {
                    vowelCount++;
                }
            } else if (ch != ' ') { // ignoring spaces
                hasOnlyAlphabets = false;
            }
        }

        if (!hasOnlyAlphabets) {
            System.out.println("Please enter only alphabets.");
        } else if (vowelCount == 0) {
            System.out.println("The entered string doesn't have any vowels.");
        } else {
            System.out.println("The number of vowels in the string: " + vowelCount);
        }
    }
}
/*
Enter the String: 
Sudharshan
The number of vowels in the string: 3

*/