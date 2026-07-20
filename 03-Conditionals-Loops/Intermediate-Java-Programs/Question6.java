/*
 * Question 6 - Intermediate Java Programs
 *
 * Calculate Commission Percentage
 */
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the price value ");
            double price = sc.nextDouble();
            System.out.println("enter your commision percentage ");
            double percentage = sc.nextDouble()/100;
            double commision = percentage * price;
            System.out.println("your comission will be "+commision);
        }
    }
}
