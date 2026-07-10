/*
 * Question 1 - Basic Java Programs
 *
 * Area Of Circle Java Program
 */
import java.util.Scanner;
public class Question1 {
    public double areaOfCircle(double radius) {
        double area;
        return area=Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of a circle : ");
        double radius = sc.nextDouble();
        Question1 q=new Question1();
        System.out.println("The area of given circle is  : "+q.areaOfCircle(radius));
        sc.close();
    }
}
