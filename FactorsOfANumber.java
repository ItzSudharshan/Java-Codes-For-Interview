import java.util.*;
public class FactorsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("the Factors of the Given Number are :");
		for(int i = 1 ; i<= num; i++) {
			if(num % i == 0) {
				System.out.println(i+" ");
			}
		}

	}

}
/*
Enter the Number: 
6
the Factors of the Given Number are :
1 
2 
3 
6 
*/