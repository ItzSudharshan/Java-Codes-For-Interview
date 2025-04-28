import java.util.*;

public class SquareOfFibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int N = sc.nextInt();
        
        System.out.println("The squares of Fibonacci series up to " + N + " terms are:");
        getFibonacci(N);
    }
    
    public static void getFibonacci(int N) {
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= N; i++) {
            int square = a * a;
            System.out.print(square+" ");
            
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
/*
Enter the Value of N
8
The squares of Fibonacci series up to 8 terms are:
0 1 1 4 9 25 64 169 
*/