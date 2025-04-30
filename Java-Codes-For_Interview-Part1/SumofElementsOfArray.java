import java.util.*;
public class SumofElementsOfArray {

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
		int sum = 0;
		for(int i =0 ; i< size ; i++) {
			sum += arr[i];
		}
		System.out.println("The Sum of All Elements of the Array is "+sum);

	}

}
/*
Enter the Size of the Array
5
Enter the Elements of the Array:
1 2 3 4 5
The Sum of All Elements of the Array is 15
*/