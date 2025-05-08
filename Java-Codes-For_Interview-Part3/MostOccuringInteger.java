import java.util.*;
public class MostOccuringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
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
		getMostOccuringInteger(arr, size);
	}
	
	public static void getMostOccuringInteger(int arr[], int size) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		for(int i =0 ; i< size; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+ 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		int maxFreq = -1;
		int maxElement = -1;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getKey() > maxFreq) {
				maxFreq = entry.getValue();
				maxElement = entry.getKey();
			}
		}
		System.out.println("The Most Occuring Integer is "+maxElement+ " Which is Appearing " +maxFreq+ " Times ");
	}

}
/*
 * Enter the Size of the Array: 
5
Enter the Elements of the Array: 
1 1 1 2 3
The Elements of the Array are: 
1 1 1 2 3 
The Most Occuring Integer is 1 Which is Appearing 3 Times 
*/
