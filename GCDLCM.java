import java.util.*;
public class GCDLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number1");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number2");
		int num2 = sc.nextInt();
		int lcm = 0;
		int hcf = 0;
		for(int i = 1; i<= num1 || i<= num2 ; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		lcm = (num1 * num2)/hcf;
		System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm);
		System.out.println("The HCF of "+num1+" and "+num2+" IS "+hcf);
	}

}
/*
Enter the Number1
10
Enter the Number2
20
The LCM of 10 and 20 is 20
The HCF of 10 and 20 IS 10

*/