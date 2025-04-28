import java.util.*;
public class GCDofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of b: ");
		int b = sc.nextInt();
		int result = getGCD(a, b);
		System.out.println("The GCSD of "+a+" and "+b+" is "+result);
	}
	
	public static int getGCD(int a,int  b) {
		if(b == 0) {
			return a ;
		}else {
			return getGCD(b, a % b);
		}
	}

}
/*
Enter the value of a: 
48
Enter the Value of b: 
18
The GCSD of 48 and 18 is 6
*/