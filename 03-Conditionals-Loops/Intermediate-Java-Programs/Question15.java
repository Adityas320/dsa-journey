/*
 * Question 15 - Intermediate Java Programs
 *
 * Find Ncr & Npr
 */
import java.util.Scanner;
public class Question15 {
    static long factorial(int n) {
        long factorial = 1;
        for(int i=1; i<=n;i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
    static long ncr (int n,int r) {
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    static long npr (int n, int r) {
        return factorial(n)/factorial(n-r);
    }
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter both numbers");
            int n = sc.nextInt();
            int r= sc.nextInt();
            if(r>=0&&r<=n) {
            System.out.println("the ncr "+ncr(n, r)+ " and npr is "+npr(n, r));
            } else {
                System.out.println("not compitable");
            }
        }
    }
}
