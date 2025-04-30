import java.util.Scanner;
public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array :");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		int secondLargestElement = getSecondLargestElement(arr, size);
		System.out.println("The Second Largest Element in the Given Array is "+secondLargestElement);

	}
	public static int getSecondLargestElement(int arr[],int  size) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i =0 ; i< size ; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if (arr[i] !=  largest && arr[i] < secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
/*
Enter the Size of the Array: 
5
Enter the Elements of the Array :
10 20 30 40 50 
The Second Largest Element in the Given Array is 40

*/