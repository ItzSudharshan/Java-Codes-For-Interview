import java.util.*;
public class LinearSearch {

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
		System.out.println("Enter the Target Element: ");
		int targetElement = sc.nextInt();
		int result = performLinearSearch(arr, targetElement);
		if(result == - 1) {
			System.out.println("Element Doesnt Exist in the Given Array");
		}else {
			System.out.println("Element "+targetElement+" Has been Found in the Array Using Linear Search");
			System.out.println("Element is Present at Index: "+result);
			System.out.println("The Time Complexity is As Given Below:");
			System.out.println("BEST CASE -> O(1) || WORST CASE -> O(n) || AVERAGE CASE -> O(n)");
			System.out.println("The space complexity is O(1)");
		}

	}
	public static int performLinearSearch(int arr[], int targetElement) {
		for(int i =0 ; i< arr.length; i++) {
			if(arr[i] == targetElement) {
				return i;
			}
		}
		return -1;
	}

}
