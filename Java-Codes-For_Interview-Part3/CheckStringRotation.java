import java.util.*;
public class CheckStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1");
		String str1 = sc.nextLine();
		System.out.println("Enter the String2");
		String str2 = sc.nextLine();
		if(isStringRotation(str1, str2)){
			System.out.println(str2+" is String Rotation of "+str1);
		}else {
			System.out.println(str2+" is not a String Rotation of "+str1);
		}

	}
	public static boolean isStringRotation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		return (str1 + str1).contains(str2);
	}
}
/*
Enter the String1
abcd
Enter the String2
cdab
cdab is String Rotation of abcd
-------------------------------
Enter the String1
waterbottle
Enter the String2
erbottlewat
erbottlewat is String Rotation of waterbottle
--------------------------------
Enter the String1
Sudhar
Enter the String2
shan
shan is not a String Rotation of Sudhar
*/