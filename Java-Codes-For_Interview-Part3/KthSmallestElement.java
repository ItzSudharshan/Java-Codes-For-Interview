import java.util.*;
public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Elements of the Array are: ");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("Enter the Value of K");
		int k = sc.nextInt();
		if(k >= 0 && k < size) {
			Arrays.sort(arr);
			System.out.println("The Kth("+k+") Smallest element in the Array is "+arr[k - 1]);
		}else {
			System.out.println("Enter a Valid Value of K");
		}

	}

}
/*
 * Enter the Size of the Array : 
5
Enter the Elements of the Array: 
10 20 30 40 50 
The Elements of the Array are: 
10 20 30 40 50 
Enter the Value of K
2
The Kth(2) Smallest element in the Array is 20
*/
