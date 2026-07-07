/*
 * Question 2
 *
 * Take name as input and print a greeting message for that particular name.
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name =sc.next();
        System.out.println("Hello " + name + " welcome to the world of computing " );
        sc.close();
    }
}
