import java.util.*;
public class FindingRootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the Value of c: ");
		int c = sc.nextInt();
		findQuadraticRoots(a,b,c);
	}
	public static void findQuadraticRoots(int a,int b,int c) {
		if (a == 0){
			System.out.println("Invalid Value .");
			return;
		}
		
		int d = (b * b )- 4 * a * c;
		double sqrt_value = Math.sqrt(Math.abs(d));
		
		if(d > 0) {
			System.out.println("The Roots are Real");
			System.out.println(((-b + sqrt_value) / (2 * a)) + " \n " + ((-b - sqrt_value) / (2 * a)));
		}
		
		if(d == 0) {
			System.out.println("The Roots are Equal");
			System.out.println(-(double)b/(2*a)+" \n "+ (-b)/(2 * a));
		}
		if( d < 0) {
			System.out.println("The Roots are Complex");
			System.out.println(-(double)b / (2 * a )+" + i "+ sqrt_value/(2 * a) + " \n "+
								-(double)b / (2 * a) + " -i "+ sqrt_value / (2 * a));
		}
	}

}
/*
Enter the Value of a: 
1
Enter the Value of b: 
-5
Enter the Value of c: 
6
The Roots are Real
3.0 
 2.0
---------------------
Enter the Value of a: 
1
Enter the Value of b: 
-4
Enter the Value of c: 
4
The Roots are Equal
2.0 
 2
--------------------
Enter the Value of a: 
1
Enter the Value of b: 
2
Enter the Value of c: 
5
The Roots are Complex
-1.0 + i 2.0 
 -1.0 -i 2.0

*/