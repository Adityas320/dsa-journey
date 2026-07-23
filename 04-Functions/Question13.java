/*
 * Question 13
 *
 * Write a function that returns all prime numbers between two given numbers.
 *
 * Link: https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/
 * 
 */
import java.util.Scanner;
public class Question13 {
    static boolean primeNumber(int a) {
        for(int i=2;i*i<=a;i++) {
            if(a%i==0) {
            return  false;
            }
        }
        return  true;
    }

    
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the range of number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i =a;i<=b;i++) {
                if(primeNumber(i)==true) {
                    System.out.println(i);
                }
            }

        }
    }
}
