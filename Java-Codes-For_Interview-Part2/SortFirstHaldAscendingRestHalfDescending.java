import java.util.*;
public class SortFirstHaldAscendingRestHalfDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array : ");
		for(int i =0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Output after Sorting First half of the Array in Ascending Order and Second Half is Descending Order is As Follows: ");
		Arrays.sort(arr);
		for(int i = 0 ; i< size/2; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int j = size - 1; j > size/2; j --) {
			System.out.print(arr[j]+" ");
		}

	}

}
/*
Enter the Size of the Array : 
6
Enter the Elements of the Array : 
50 30 10 20 40 100 
The Output after Sorting First half of the Array in Ascending Order and Second Half is Descending Order is As Follows: 
10 20 30 100 50 
*/