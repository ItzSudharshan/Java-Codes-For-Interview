import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array Before Perfoming Insertion Sort is : ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		performInsetionSort(arr);
		System.out.println("The Elements of the Array After Performing Insertion Sort is : ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("The Time Complexity of Insertion Sort is As Follows: ");
		System.out.println("BEST CASE -> O(n) || AVERAGE CASE -> O(n²) || WORST CASE -> O(n²)");
		System.out.println("The Space Complexity of Insertion Sort is O(1)");

	}
	public static void performInsetionSort(int arr[]) {
		for(int i =0 ; i< arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
}
/*
Enter the Size of the Array: 
6
Enter the Elements of the Array: 
20 100 101 30 2 1
The Elements of the Array Before Perfoming Insertion Sort is : 
20 100 101 30 2 1 
The Elements of the Array After Performing Insertion Sort is : 
1 2 20 30 100 101 
The Time Complexity of Insertion Sort is As Follows: 
BEST CASE -> O(n) || AVERAGE CASE -> O(n²) || WORST CASE -> O(n²)
The Space Complexity of Insertion Sort is O(1)
*/