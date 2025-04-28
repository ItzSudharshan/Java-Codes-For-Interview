import java.util.*;
public class OddSumUpto50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Sum of Odd Numbers upto 50 is ");
		int sum = 0 ;
		for(int i = 1 ; i <= 50; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
/*
The Sum of Odd Numbers upto 50 is 
625
*/