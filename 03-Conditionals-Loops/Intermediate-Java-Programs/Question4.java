/*
 * Question 4 - Intermediate Java Programs
 *
 * Calculate Discount Of Product
 */
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the MRP");
            int MRP = sc.nextInt();
            System.out.println("enter the discount percent");
            double Discount = (sc.nextFloat()/100)*MRP;
            double final_price = MRP - Discount;
            System.out.println("final price after discount "+final_price);
        }
    }
}
