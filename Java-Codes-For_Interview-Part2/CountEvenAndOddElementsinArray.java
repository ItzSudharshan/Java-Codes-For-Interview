import java.util.*;
public class CountEvenAndOddElementsinArray {

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
		getCountEvenOddElements(arr, size);
	}
	public static void getCountEvenOddElements(int arr[],int  size) {
		int evenCount = 0;
		int oddCount = 0;
		for(int i =0 ; i< size; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}else if(arr[i] % 2 != 0){
				oddCount++; 
			}
		}
		System.out.println("The Number of Even Elements in the Array is "+evenCount);
		System.out.println("The Number of Odd Elements in the Array is "+oddCount);
	}

}
/*
Enter the Size of the Array: 
8
Enter the Elements of the Array: 
1 2 3 4 5 6 7 8
The Number of Even Elements in the Array is 4
The Number of Odd Elements in the Array is 4
*/