/*
 * Question 22 - Basic Java Programs
 *
 * Subtract the Product and Sum of Digits of an Integer
 *
 * Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
import java.util.Scanner;
public class Question22 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            int product = 1;
            int sum = 0;
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int temp = n;
            while(temp!=0) {
                int a = temp%10;
                product = product * a;
                sum = sum +a;
                temp = temp/10;
            }
            System.out.println(product-sum);
        }

    }
}
