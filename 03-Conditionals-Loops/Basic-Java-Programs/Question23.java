/*
 * Question 23 - Basic Java Programs
 *
 * Input a number and print all the factors of that number (use loops).
 */
import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        // TODO: implement solution
        try(Scanner sc= new Scanner(System.in)){
            int factorial=1;
            System.out.println("enter the number ");
            int num=sc.nextInt();
            for(int i=1;i<=num;i++) {
                factorial=factorial*i;
            }
            System.out.println("the factorial of number is : "+ factorial);
        }


    }
}
