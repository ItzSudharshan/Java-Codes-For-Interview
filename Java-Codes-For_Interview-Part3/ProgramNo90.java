import java.util.*;
public class ProgramNo90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter the Value of Y: ");
		int y = sc.nextInt();
		int count = 0;
		for(int i = x ; i<= y; i++) {
			if(i % x == 0) {
				count++;
			}
		}
		System.out.println("The count Of numbers between x and y (inclusive) are divisible by x is "+count);
	}

}
/*
Enter The Value of X: 
3
Enter the Value of Y: 
20
The count Of numbers between x and y (inclusive) are divisible by x is 6
*/