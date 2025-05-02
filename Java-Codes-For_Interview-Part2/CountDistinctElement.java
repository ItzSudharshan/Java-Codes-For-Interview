import java.util.*;
public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i< size ;i++) {
			arr[i] = sc.nextInt();
		}
		
		CountAndDisplayDistinctElement(arr, size);

	}
	public static void CountAndDisplayDistinctElement(int arr[], int size) {
		LinkedHashSet<Integer> Lhs = new LinkedHashSet<>();
		for(int i =0 ; i< size; i++) {
			Lhs.add(arr[i]);
		}
		System.out.println("The Distinct Elements of the Array : ");
		for(Integer element : Lhs) {
			System.out.print(element+" ");
		}
		System.out.println();
		int count = Lhs.size();
		System.out.println("The Number of Distinct Elements in the Array is "+count);
	}

}
/*
 * Enter the Size of the Array: 
8
Enter the Elements of the Array: 
1 1 2 3 4 5 6 5
The Distinct Elements of the Array : 
1 2 3 4 5 6 
The Number of Distinct Elements in the Array is 6
*/
