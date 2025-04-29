import java.util.*;
public class NthEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vaue of n");
		int n = sc.nextInt();
		int count = 1;
		System.out.println("The "+n+" Even Numbers are ");
		for(int i = 1; count<= n ; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
				count ++;
			}
		}

	}

}
