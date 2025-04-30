import java.util.*;
public class FibonacciTermsUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of N");
		int num = sc.nextInt();
		int a =0 ;
		int b = 1;
		System.out.println("The Fibonacci terms Upto "+num+" are ");
		for(int i = 1; i<= num ; i++) {
			System.out.print(a+" ");
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}

	}

}
/*
Enter the Value of N
5
The Fibonacci terms Upto 5 are 
0 1 1 2 3 
*/