/*
 * Question 7
 *
 * To calculate Fibonacci Series up to n numbers.
 */
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        // TODO: implement solution
        System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a +" ");
        System.out.print(b + " ");
        for(int i=0;i<n-2;i++) {
            int c=a+b;
            System.out.print(c + " ");
            int e=b;
            b=c;
            a=e;
        }
        sc.close();
    }
}
