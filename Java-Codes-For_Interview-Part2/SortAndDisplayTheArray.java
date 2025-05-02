import java.util.*;
public class SortAndDisplayTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array after Sorting is: ");
		Arrays.sort(arr);
		for(int i = 0; i < size ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
/*
Enter the Size of the Array: 
5
Enter the Elements of the Array: 
40 50 60 23 1
The Elements of the Array after Sorting is: 
1 23 40 50 60 
*/