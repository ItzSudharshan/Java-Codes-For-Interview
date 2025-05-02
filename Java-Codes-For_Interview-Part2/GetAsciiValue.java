import java.util.*;
public class GetAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		System.out.println("The ASCII Value of the Given Character "+ch+" is "+(int)ch);
		

	}

}
/*
Enter the Character: 
a
The ASCII Value of the Given Character a is 97
-------------------------------------------------
Enter the Character: 
A
The ASCII Value of the Given Character A is 65
*/