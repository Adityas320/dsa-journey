/*
 * Question 14
 *
 * Write a function that returns the sum of first n natural numbers.
 *
 * Link: https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/
 */
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = (n*(n+1))/2;
            System.out.println("sum of "+ n +" natural numbers "+ sum);
        }

    }
}
