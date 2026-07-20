/*
 * Question 5 - Intermediate Java Programs
 *
 * Calculate Distance Between Two Points
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the speed in km/hr");
            double speed= sc.nextDouble();
            System.out.println("enter the time in hour");
            double time = sc.nextDouble();
           double distance = speed * time;
            System.out.println("distance is " + distance);
        }
    }
}
