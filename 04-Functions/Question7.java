/*
 * Question 7
 *
 * Define a method to find out if a number is prime or not.
 *
 * Link: https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/
 */
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int num = sc.nextInt();
            boolean isPrime = false;
            for(int i=2;i<num;i++){
                if(num%i==0) {
                    isPrime=true;
                    System.out.println("it is prime ");
                    return;
                }
            }
            System.out.println("not prime");
        }
        }
}
