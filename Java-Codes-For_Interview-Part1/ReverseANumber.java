import java.util.*;
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int temp = num;
		while(temp != 0) {
			int rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		System.out.println("The reverse of the Number "+num+" is "+reverse);
	}

}
/*
Enter the Number: 
123
The reverse of the Number 123 is 321

*/