import java.util.*;
public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array are: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		getMaxSumSubarray(arr, size);
	}
	public static void getMaxSumSubarray(int arr[],int  size) {
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		int sum = 0;
		int tempStart = 0;
		for(int i = 0 ; i < size ; i++) {
			sum += arr[i];
			if(sum > maxSum) {
				maxSum = sum;
				start = tempStart;
				end = i;
			}
			if(sum < 0) {
				sum = 0;
				tempStart = i + 1;
			}
		}
		System.out.println("The Maximum Sum from the Elements of the Array is "+maxSum);
		System.out.println("The Sub Array which gives the max Sum "+maxSum+" is ");
		for(int i = start; i<= end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
/*
 * Enter the Size of the Array: 
5
Enter the Elements of the Array: 
10 2 4 -1 10
The Elements of the Array are: 
10 2 4 -1 10 
The Maximum Sum from the Elements of the Array is 25
The Sub Array which gives the max Sum 25 is 
10 2 4 -1 10 
*/
