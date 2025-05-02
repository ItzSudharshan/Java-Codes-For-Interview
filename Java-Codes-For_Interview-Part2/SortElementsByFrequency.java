import java.util.*;
public class SortElementsByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array : ");
		for(int i =0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		sortElementsByFrequency(arr,size);
	}
	
	public static void sortElementsByFrequency(int arr[],int size) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i =0 ; i < size; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+ 1);
			}else {
				hm.put(arr[i], 1);
			}
		}
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
		Collections.sort(list , new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println("The Elements are Sorted According to the Frequency..");
		for(Map.Entry<Integer, Integer> entry : list) {
			int freq = entry.getValue();
			int element = entry.getKey();
			for(int i = 0 ; i< freq; i++) {
				System.out.print(element+" ");
			}
		}
	}

}
/*
 * Enter the Size of the Array : 
6
Enter the Elements of the Array : 
1 2 2 3 2 8
The Elements are Sorted According to the Frequency..
2 2 2 1 3 8 
*/
