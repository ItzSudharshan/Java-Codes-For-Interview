import java.util.Scanner;
public class LargestElementintheArray {

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
		
		int largestElement = getLargestElement(arr, size);
		System.out.println("The Largest Element in the Array is "+largestElement);

	}
	public static int getLargestElement(int arr[], int size) {
		int largest = Integer.MIN_VALUE;
		for(int i =0 ; i< size ; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

}
/*
Enter the Size of the Array
5
Enter the Elements of the Array:
20 30 40 50 60
The Largest Element in the Array is 60

*/