import java.util.*;
public class MergeSort {

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
		System.out.println("The Elements of the Array Before Performing Merge Sort is : ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		performMergeSort(arr, 0, arr.length - 1);
		System.out.println("The Elements of the Array After Performing Merge Sort is : ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("The Time Complexity of Merge Sort is : ");
		System.out.println("BEST CASE : || AVERAGE CASE || WORST CASE -> O(n log n)");
		System.out.println("The Space Complexity of Merge Sort is: O(n)");


	}
	public static void performMergeSort(int arr[], int low, int high) {
		if(low >= high) {
			return;
		}
		if(low < high) {
			int mid = (low + high)/2;
			performMergeSort(arr,low,mid);
			performMergeSort(arr, mid + 1 , high);
			Merge(arr ,low , mid, high);
		}

	}
	
	public static void Merge(int arr[], int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> temp = new  ArrayList<>();
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i = low ; i<= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
}
/*
 * Enter the Size of the Array: 
 6
Enter the Elements of the Array: 
10 20 554 1 2 1
The Elements of the Array Before Performing Merge Sort is : 
10 20 554 1 2 1 
The Elements of the Array After Performing Merge Sort is : 
1 1 2 10 20 554 
The Time Complexity of Merge Sort is : 
BEST CASE : || AVERAGE CASE || WORST CASE -> O(n log n)
The Space Complexity of Merge Sort is: O(n)
*/
