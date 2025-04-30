import java.util.*;
public class NumberOfDaysinAnyYearAnyMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		System.out.println("Enter the Month by the Number: (1.January 2.February.....)");
		int month = sc.nextInt();
		if(month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
			System.out.println("The Number of Days in this Month is 29");
		}else if (month == 2) {
			System.out.println("The Number of Days in the Month is 28");
		}else if(month == 1 || month == 3 || month == 5 || month == 7|| month == 8 || month == 10 || month == 12) {
			System.out.println("The Number of Days in this Month is 31");
		}else {
			System.out.println("The Number of Days in this Month is 30");
		}

	}

}
/*
 * Enter the Year: 
2020
Enter the Month by the Number: (1.January 2.February.....)
3
The Number of Days in this Month is 31
--------------------------------------------
Enter the Year: 
2020
Enter the Month by the Number: (1.January 2.February.....)
2
The Number of Days in this Month is 29

*/
