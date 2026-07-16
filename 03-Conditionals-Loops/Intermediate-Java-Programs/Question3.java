/*
 * Question 3 - Intermediate Java Programs
 *
 * Calculate Average Of N Numbers
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the numbers");
            int n=3;
            int a= sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
                int sum=a+b+c;
                double average = sum/n;
            System.out.println(average);
        }
    }
}
