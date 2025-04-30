import java.util.*;
public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the Value of b: ");
		int b = sc.nextInt();
		System.out.println("The Values Before Swapping is a : "+a+" and b is : "+b);
		a = a + b;
		b = a - b; 
		a = a - b;
		System.out.println("The Values After Swapping is a : "+a+" and b is : "+b);

	}

}
/*
Enter the Value of a : 
10
Enter the Value of b: 
20
The Values Before Swapping is a : 10 and b is : 20
The Values After Swapping is a : 20 and b is : 10
*/