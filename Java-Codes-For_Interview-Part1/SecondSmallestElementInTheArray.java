import java.util.*;
public class SecondSmallestElementInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elementts of the Array :");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		int secondSmallestElement = getSecondSmallestElement(arr, size);
		System.out.println("The Second Smallest Element in the Given Array is "+secondSmallestElement);

	}
	public static int getSecondSmallestElement(int arr[],int  size) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i =0 ; i< size ; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if (arr[i] !=  smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

}
/*
Enter the Size of the Array: 
5
Enter the Elementts of the Array :
10 20 30 40 50 
The Second Smallest Element in the Given Array is 20

*/