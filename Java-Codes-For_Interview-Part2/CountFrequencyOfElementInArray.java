import java.util.*;
public class CountFrequencyOfElementInArray {

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
		getFrequencyOfElements(arr, size);

	}
	public static void getFrequencyOfElements(int arr[], int size) {
			HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i =0 ; i< arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+ 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("ELEMENT ---------------------------------- FREQUENCY");
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			int freq = entry.getValue();
			int element = entry.getKey();
			
			System.out.println(element+"     --------------------------------------> "+freq);
		}
	}

}
/*
Enter the Size of the Array: 
6
Enter the Elements of the Array: 
1 2 4 1 2 2
ELEMENT ---------------------------------- FREQUENCY
1     --------------------------------------> 2
2     --------------------------------------> 3
4     --------------------------------------> 1
*/