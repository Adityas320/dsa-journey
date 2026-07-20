/*
 * Question 13 - Intermediate Java Programs
 *
 * Sum Of N Numbers
 */
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the total numbers to sum");
            int n = sc.nextInt();
            int sum = 0;
            int temp = n;
            while(temp !=0) {
                sum = sum + sc.nextInt();
                temp--;
            }
            System.out.println("The sum of "+ n + " numbers is "+ sum);
        }
    }
}
