import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array Before Performing Selection Sort is: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		performSelectionSort(arr);
		System.out.println("The Elements of the Array After Performing Selection Sort is: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("The Time Complexity of Selection Sort is : ");
		System.out.println("BEST CASE || WORST CASE || AVERAGE CASE -> O(n²)");
		System.out.println("The Space Complexity of Selection Sort is O(1)");
		
	}
	public static void performSelectionSort(int arr[]) {
		for(int i =0; i< arr.length; i++) {
			int min = i;
			for(int j = i + 1; j< arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
/*
Enter the Size of the Array: 
5
Enter the Elements of the Array: 
60 30 20 10 5
The Elements of the Array Before Performing Selection Sort is: 
60 30 20 10 5 
The Elements of the Array After Performing Selection Sort is: 
5 10 20 30 60 
The Time Complexity of Selection Sort is : 
BEST CASE || WORST CASE || AVERAGE CASE -> O(n²)
The Space Complexity of Selection Sort is O(1)
*/