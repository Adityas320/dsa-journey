/*
 * Question 2 - Intermediate Java Programs
 *
 * Calculate Electricity Bill
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the units ");
            int units = sc.nextInt();
            double standardrate= 10.1;
            double electricitybill = units *standardrate;
            System.out.println("Electricity bill "+electricitybill);
        }

    }
}
