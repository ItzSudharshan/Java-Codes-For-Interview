import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of The Array Before Performing Quick Sort is ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		performQuickSort(arr, 0, arr.length -1);
		System.out.println("The Elements of The Array After Performing Quick Sort is ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("The Time Complexity of Quick Sort Algorithm is Given below ");
		System.out.println("BEST CASE || AVERAGE CASE -> O(n log n)|| WORST CASE -> O(n²)");
		System.out.println("The Space Complexity of Quick Sort in Best case is O(log n) and in Worst case is O(n)");
	}
	public static void performQuickSort(int arr[], int lb, int ub) {
		if(lb < ub) {
			int pivot = partition(arr, lb, ub);
			performQuickSort(arr, lb, pivot - 1);
			performQuickSort(arr, pivot + 1, ub);
			
		}
	}
	public static int partition(int arr[],int  lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		if(start < end) {
			while(start <= ub && arr[start] <= pivot) {
				start++;
			}
			while(end > lb && arr[end] > pivot) {
				end--;
			}
			if(start < end) {
				swap(arr, start, end);
			}
		}
		swap(arr, lb , end);
		return end;
		
	}
	public static void swap(int arr[], int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
/*
Enter The Size of the Array: 
6
Enter the Elements of the Array: 
90 8 4 27 12 10
The Elements of The Array Before Performing Quick Sort is 
90 8 4 27 12 10 
The Elements of The Array After Performing Quick Sort is 
4 8 10 12 27 90 
The Time Complexity of Quick Sort Algorithm is Given below 
BEST CASE || AVERAGE CASE -> O(n log n)|| WORST CASE -> O(n²)
The Space Complexity of Quick Sort in Best case is O(log n) and in Worst case is O(n)
*/