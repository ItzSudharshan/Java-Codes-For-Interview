import java.util.*;
public class CheckPositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println(num+" is a Negative Number..");
		}else if(num == 0) {
			System.out.println(num+" is 0(Zero)..");
		}else {
			System.out.println(num+" is a Positive Number..");
		}
	}

}
/*
 * Enter the Number:
0
0 is 0(Zero)..
-----------------
Enter the Number:
5
5 is a Positive Number..
-----------------
Enter the Number:
-2
-2 is a Negative Number..

 */
