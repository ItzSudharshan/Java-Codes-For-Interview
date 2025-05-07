import java.util.*;
public class ShiftZeroesToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array are: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		int j = 0;
		int temp[] = new int[size];
		for(int i =0 ; i< size; i++) {
			if(arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		while(j < size) {
			temp[j++] = 0;
		}
		for(int i =0 ; i< size ; i++) {
			arr[i] = temp[i];
		}
		System.out.println("All Zeroes have been shifted to the End of the Array: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
/*
 * Enter the Size of the Array: 
8
Enter the Elements of the Array: 
1 0 1 1 0 0 2 9
The Elements of the Array are: 
1 0 1 1 0 0 2 9 
All Zeroes have been shifted to the End of the Array: 
1 1 1 2 9 0 0 0 
*/
