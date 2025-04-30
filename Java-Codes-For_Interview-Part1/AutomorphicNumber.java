import java.util.*;
public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of X");
		int x = sc.nextInt();
		int y = x * x;
		System.out.println("The Square of "+x+" is "+y);
		if(x % 10 == y % 10) {
			System.out.println(x+" is an Automorphic Number..");
		}else {
			System.out.println(x+" is not An Automorphic Number..");
		}
	}

}
/*
Enter the Value of X
5
The Square of 5 is 25
5 is an Automorphic Number..
---------------------------
Enter the Value of X
12
The Square of 12 is 144
12 is not An Automorphic Number..

*/