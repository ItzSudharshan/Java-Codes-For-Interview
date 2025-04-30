import java.util.*;
public class SmallestElementIntheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array:");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int smallestElement = getSmallestElement(arr, size);
		System.out.println("The Smallest Element in the Array is "+smallestElement);

	}
	public static int getSmallestElement(int arr[], int size) {
		int smallest = Integer.MAX_VALUE;
		for(int i =0 ; i< size ; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}

}
/*
Enter the Size of the Array
5
Enter the Elements of the Array:
10 20 30 40 1
The Smallest Element in the Array is 1
*/