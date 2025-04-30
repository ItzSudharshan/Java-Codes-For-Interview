import java.util.*;
public class SquareRootOfNumberBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int result = getSquareRootOfNumberUsingBinarySearch(num);
		System.out.println("The Square Root of the Number "+num+" is "+result);

	}
	
	public static int getSquareRootOfNumberUsingBinarySearch(int num) {
		int left = 1;
		int right = num;
		int ans = 0;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(mid * mid == num) {
				return mid;
			}
			if(mid * mid < num) {
				left = mid - 1;
				ans = mid;
			}else {
				right = mid + 1;
			}
		}
		return ans;
	}

}
/*
 * Enter the Number: 
4
The Square Root of the Number 4 is 2
-----------------------------------
Enter the Number: 
64
The Square Root of the Number 64 is 8
------------------------------------
*/
