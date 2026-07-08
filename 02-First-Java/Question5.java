/*
 * Question 5
 *
 * Take 2 numbers as input and print the largest number.
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        // TODO: implement solution
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first nummber ");
        int num1=sc.nextInt();
        System.out.print("enter the second nummber ");
        int num2=sc.nextInt();
        if(num1==num2) {
            System.out.println("equal");
        }
        else if(num1>num2) {
            System.out.println(num1+" is greater than " + num2);
        }
        else {
            System.out.println(num2 + " is greater than " + num1);
        }
        sc.close();
    }
}
