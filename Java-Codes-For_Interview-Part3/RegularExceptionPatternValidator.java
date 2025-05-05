import java.util.*;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;
public class RegularExceptionPatternValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pattern");
		String inputRegexPattern = sc.nextLine();
		try {
			Pattern.compile(inputRegexPattern);
			System.out.println(inputRegexPattern+" is a valid Pattern");
		}catch(PatternSyntaxException e) {
			System.out.println("Not a Valid Pattern "+e.getMessage());
		}finally {
			sc.close();
		}
	}

}
/*
Enter the Pattern
[a-zA-Z0-9]+
[a-zA-Z0-9]+ is a valid Pattern
--------------------------------
Enter the Pattern
(?<=\d)
(?<=\d) is a valid Pattern
--------------------------------
Enter the Pattern
[a-zA-Z0-9+
Not a Valid Pattern Unclosed character class near index 10
[a-zA-Z0-9+
          ^

*/