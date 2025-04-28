import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year");
		int year = sc.nextInt();
		if(year % 400 == 0) {
			System.out.println(year+" is a Leap Year.");
		}else if(year % 100 != 0 && year % 4 == 0) {
			System.out.println(year+" is a Leap Year");
		}else{
			System.out.println(year+" isnt a Leap Year");
		}
	}

}
/*
Enter The Year
2000
2000 is a Leap Year.
----------------------
Enter The Year
1900
1900 isnt a Leap Year

*/