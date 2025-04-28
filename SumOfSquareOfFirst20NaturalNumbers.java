import java.util.*;
public class SumOfSquareOfFirst20NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int sum = 0;
		for(int i = 1; i<= n ; i++) {
			sum += i * i ;
		}
		System.out.println("The sum of The square of first 20 Natural Numbers is "+sum);
	}

}
/*
The sum of The square of first 20 Natural Numbers is 2870
*/