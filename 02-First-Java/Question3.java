/*
 * Question 3
 *
 * Write a program to input principal, time, and rate (P, T, R) from the user and
 * find Simple Interest.
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc=new Scanner(System.in);
        System.out.println("enter all the 3 values p t r");
        float p= sc.nextFloat();
        float t=sc.nextFloat();
        float r=sc.nextFloat()/100;
        float Simple_interest= p*t*r;
        System.out.println("the simple interest will be "+ Simple_interest);
        sc.close();
    }
}
