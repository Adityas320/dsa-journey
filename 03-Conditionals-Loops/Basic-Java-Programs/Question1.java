/*
 * Question 1 - Basic Java Programs
 *
 * Area Of Circle Java Program
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");
        double radius = sc.nextDouble();
        double areaOfCircle= 3.14 * radius * radius ;
        System.out.println("The area of given circle is  : "+areaOfCircle);
        sc.close();
    }
}
