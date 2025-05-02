import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class DisplayNonRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements of the Array: ");
		for(int i = 0 ; i< size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Non Repeating Elements of the Array are : ");
		getOnlyNonRepeatingElement(arr, size);

	}
	
	public static void getOnlyNonRepeatingElement(int arr[],int  size) {
		LinkedHashMap<Integer, Integer> Lhm = new LinkedHashMap<>();
		for(int i =0 ; i< size ; i++) {
			if(Lhm.containsKey(arr[i])) {
				Lhm.put(arr[i], Lhm.get(arr[i]) + 1);
			}else {
				Lhm.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : Lhm.entrySet()) {
			int frequency = entry.getValue();
			int Element = entry.getKey();
			if(frequency == 1) {
				System.out.println(Element+" ---> " +frequency+" Times.");
			}
		}
	}
}
/*
Enter the Size of the Array: 
8
Enter the Elements of the Array: 
1 1 2 3 2 4 5 5
The Non Repeating Elements of the Array are : 
3 ---> 1 Times.
4 ---> 1 Times.
*/