import java.util.*;
public class CheckPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		boolean result = checkPerfectSquare(num);
		if(result) {
		System.out.println(num+" is a Perfect Square..");
	}else {
		System.out.println(num+" is not a Perfect Square");
	}
}
	public static boolean checkPerfectSquare(int num) {
		if(num <= 0) {
			return false;
		}
		double square_root_number = (int)Math.sqrt(num);
		return square_root_number * square_root_number == num;
	}

}
/*
Enter the Number: 
64
64 is a Perfect Square..
----------------------
Enter the Number: 
65
65 is not a Perfect Square
----------------------
*/