import java.util.*;
public class LengthofStrignWithoutUsingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String: ");
		String str = sc.nextLine();
		int count = 0;
		for(char ele : str.toCharArray()) {
			count++;
		}
		System.out.println("The Length of the Given String is "+count);
	}

}
/*
Enter the Input String: 
Sudharshan
The Length of the Given String is 10
*/