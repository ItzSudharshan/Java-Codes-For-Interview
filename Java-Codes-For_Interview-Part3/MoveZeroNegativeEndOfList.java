import java.util.*;
public class MoveZeroNegativeEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array are");
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		ShiftZeroNegative(arr, size);
	}
	public static void  ShiftZeroNegative(int arr[], int size) {
		int temp[] = new int[size];
		int index = 0;
		for(int i = 0 ; i < size; i ++) {
			if(arr[i] > 0) {
				temp[index++] = arr[i];
			}
		}
		for(int i =0 ; i < size ;i++) {
			if(arr[i] <= 0) {
				temp[index++] = arr[i];
			}
		}
		System.out.println("All Negative and Zero Elements are Pushed to the End of the List");
		for(int i =0 ; i< size; i++) {
			arr[i] = temp[i];
		}
		System.out.println("The array Elements are: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
	

}
/*
 * 
 *Enter the Size of the Array : 
7
Enter the Elements of the Array: 
0 0 -1 10 -2 20 9
The Elements of the Array are
0 0 -1 10 -2 20 9 
All Negative and Zero Elements are Pushed to the End of the List
The array Elements are: 
10 20 9 0 0 -1 -2 
*/
