import java.util.*;
public class ProgramNo93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int workLoad[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i < size; i++) {
			workLoad[i] = sc.nextInt();
		}
		int maxStreak = 0;
		int currentStreak = 0;
		for(int i =0 ; i< size; i++) {
			if(workLoad[i] > 6) {
				currentStreak++;
				maxStreak = Math.max(currentStreak, maxStreak);
			}else {
				currentStreak= 0;
			}
		}
		System.out.println("The Length of the Longest streak is "+maxStreak);
	}

}
/*
Enter the Size of the Array: 
12
Enter the Elements of the Array: 
Enter the Size of the Array: 
12
Enter the Elements of the Array: 
2 3 7 8 7 6 3 8 12 11 12 10
The Length of the Longest streak is 12
---------------------------------------
Enter the Size of the Array: 
10
Enter the Elements of the Array: 
5 5 5 7 7 7 5 5 5 5
The Length of the Longest streak is 3

*/