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
            System.out.println("enter the numbers you want to  average ");
            int n = sc.nextInt();
            int temp = n;
            double sum=0;
            while(temp!=0) {
                sum= sum + sc.nextInt();
                temp--;
            }
                double average = sum/n;
            System.out.println(average);
        }
    }
}
