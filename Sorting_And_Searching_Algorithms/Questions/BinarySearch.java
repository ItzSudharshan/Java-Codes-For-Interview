import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i =0  ; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the Target Element to Perform Binary Search: ");
		int targetElement  = sc.nextInt();
		int result = performBinarySearch(arr, targetElement);
		if(result == -1) {
			System.out.println("The Target Element "+targetElement+" isnt present in the Given Array: ");
		}else {
			System.out.println("The Taget Element "+targetElement+" is Present in the Given Array at index "+result);
			System.out.println("The Binary Search Algorithm Time Complexity is Given As Below:");
			System.out.println("BEST CASE -> O(1) || AVERAGE CASE -> O(log n) || WORST CASE -> O(log n)");
			System.out.println("Teh Space Complexity is O(1)");
		}

	}
	public static  int performBinarySearch(int arr[],int  targetElement) {
		int start = 0;
		int end = arr.length -1;
		while(start <= end) {
			int mid = (start) + ((end - start)/2);
			if(arr[mid] == targetElement) {
				return mid;
			}else if(targetElement < arr[mid]) {
				end = mid - 1;
			}else if(targetElement > arr[mid]){
				start = mid + 1;
			}
		}
		return -1;
	}

}
/*
 * Enter the Size of the Array: 
5
Enter the Elements of the Array:

1 2 3 4 5
Enter the Target Element to Perform Binary Search: 
2
The Taget Element 2 is Present in the Given Array at index 1
The Binary Search Algorithm Time Complexity is Given As Below:
BEST CASE -> O(1) || AVERAGE CASE -> O(log n) || WORST CASE -> O(log n)
The Space Complexity is O(1)
*/
