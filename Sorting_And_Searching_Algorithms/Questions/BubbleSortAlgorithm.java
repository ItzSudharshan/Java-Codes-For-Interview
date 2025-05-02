import java.util.*;
public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i = 0; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array Before Performing Bubble Sort is: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		performBubbleSort(arr);
		System.out.println("The Elements of the Array After Performing Bubble Sort is: ");
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("The Time Complexity of Bubble Sort is As Below:");
		System.out.println("BEST CASE -> O(n) || AVERAGE CASE -> O(n²) || WORST CASE -> O(n²)");

		System.out.println("The Space Complexity of Bubble Sort is O(1)");
	}
	
	public static void performBubbleSort(int arr[]) {
		int n = arr.length;
		for(int i =0 ; i< n - 1; i++) {
			for(int j = 0 ; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
/*
 * Enter the Size of the Array: 
5
Enter the Elements of the Array: 
20 10 4 2 15
The Elements of the Array Before Performing Bubble Sort is: 
20 10 4 2 15 
The Elements of the Array After Performing Bubble Sort is: 
2 4 10 15 20 
The Time Complexity of Bubble Sort is As Below:
BEST CASE -> O(n) || AVERAGE CASE -> O(n²) || WORST CASE -> O(n²)
The Space Complexity of Bubble Sort is O(1)
*/
